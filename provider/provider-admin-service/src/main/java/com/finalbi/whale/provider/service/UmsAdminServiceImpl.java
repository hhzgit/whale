package com.finalbi.whale.provider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.finalbi.whale.provider.api.UmsAdminService;
import com.finalbi.whale.provider.domain.UmsAdmin;
import com.finalbi.whale.provider.mapper.UmsAdminMapper;
import com.finalbi.whale.provider.service.fallcack.UmsAdminServiceFallback;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;

@Service(version = "1.0.0")
public class UmsAdminServiceImpl implements UmsAdminService{

    @Resource
    private UmsAdminMapper umsAdminMapper;

    @Resource
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    @SentinelResource(value = "ums.insertUser", fallback = "insertFallBack", fallbackClass = UmsAdminServiceFallback.class)
    public int insert(UmsAdmin umsAdmin) {
        // 初始化用户对象
        initUmsAdmin(umsAdmin);
        return umsAdminMapper.insert(umsAdmin);
    }

    @Override
    public UmsAdmin get(UmsAdmin umsAdmin) {
        return umsAdminMapper.selectOne(umsAdmin);
    }

    @Override
    @SentinelResource(value = "ums.getUserByUserName", fallback = "getByUserNameFallBack", fallbackClass = UmsAdminServiceFallback.class)
    public UmsAdmin get(String userName) {
        Example example = new Example(UmsAdmin.class);
        example.createCriteria().andEqualTo("username", userName);
        return umsAdminMapper.selectOneByExample(example);
    }

    @Override
    @SentinelResource(value = "ums.getUserByUserId", fallback = "getUserByUserIdFallBack", fallbackClass = UmsAdminServiceFallback.class)
    public UmsAdmin get(Long userId) {
        return umsAdminMapper.selectByPrimaryKey(userId);
    }

    /**
     * 初始化用户对象
     *
     * @param umsAdmin {@link UmsAdmin}
     */
    private void initUmsAdmin(UmsAdmin umsAdmin) {
        // 初始化创建时间
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setLoginTime(new Date());

        // 初始化状态
        if (umsAdmin.getStatus() == null) {
            umsAdmin.setStatus(0);
        }

        // 密码加密
        umsAdmin.setPassword(passwordEncoder.encode(umsAdmin.getPassword()));
    }
}
