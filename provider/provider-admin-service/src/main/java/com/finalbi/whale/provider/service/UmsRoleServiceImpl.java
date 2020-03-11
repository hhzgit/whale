package com.finalbi.whale.provider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.finalbi.whale.provider.domain.UmsRole;
import com.finalbi.whale.provider.service.fallcack.UmsRoleServiceFallback;
import javax.annotation.Resource;
import com.finalbi.whale.provider.mapper.UmsRoleMapper;
import com.finalbi.whale.provider.api.UmsRoleService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service(version = "1.0.0")
public class UmsRoleServiceImpl implements UmsRoleService{

    @Resource
    private UmsRoleMapper umsRoleMapper;

    @Override
    @SentinelResource(value = "ums.insertRole", fallback = "insertFallBack", fallbackClass = UmsRoleServiceFallback.class)
    public int insert(UmsRole role) {
        return umsRoleMapper.insert(role);
    }

    @Override
    @SentinelResource(value = "ums.updateRole", fallback = "updateFallBack", fallbackClass = UmsRoleServiceFallback.class)
    public int update(UmsRole role) {
        return umsRoleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    @SentinelResource(value = "ums.getAllRoles", fallback = "getAllFallBack", fallbackClass = UmsRoleServiceFallback.class)
    public List<UmsRole> getAll() {
        return umsRoleMapper.selectAll();
    }

    @Override
    @SentinelResource(value = "ums.getAllNormalRoles", fallback = "getAllNormalFallBack", fallbackClass = UmsRoleServiceFallback.class)
    public List<UmsRole> getAllNormal() {
        UmsRole umsRole = new UmsRole();
        umsRole.setStatus(1);
        return umsRoleMapper.select(umsRole);
    }

    @Override
    @SentinelResource(value = "ums.getAllDeletedRoles", fallback = "getAllDeletedFallBack", fallbackClass = UmsRoleServiceFallback.class)
    public List<UmsRole> getAllDeleted() {
        UmsRole umsRole = new UmsRole();
        umsRole.setStatus(0);
        return umsRoleMapper.select(umsRole);
    }

    @Override
    @SentinelResource(value = "ums.getUserRoles", fallback = "getUserRolesFallBack", fallbackClass = UmsRoleServiceFallback.class)
    public List<UmsRole> getUserRoles(Long userId) {
        return umsRoleMapper.getUserRoles(userId);
    }
}
