package com.finalbi.whale.provider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.finalbi.whale.provider.api.UmsPermissionService;
import com.finalbi.whale.provider.domain.UmsPermission;
import com.finalbi.whale.provider.mapper.UmsPermissionMapper;
import com.finalbi.whale.provider.service.fallcack.UmsPermissionServiceFallback;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(version = "1.0.0")
public class UmsPermissionServiceImpl implements UmsPermissionService{

    @Resource
    private UmsPermissionMapper umsPermissionMapper;

    @Override
    @SentinelResource(value = "ums.getUserPermissions", fallback = "getUserPermissionsFallBack", fallbackClass = UmsPermissionServiceFallback.class)
    public List<UmsPermission> getUserPermissions(Long userId) {
        return umsPermissionMapper.getUserPermission(userId);
    }

    @Override
    @SentinelResource(value = "ums.insertPermission", fallback = "insertFallBack", fallbackClass = UmsPermissionServiceFallback.class)
    public int insert(UmsPermission permission) {
        return umsPermissionMapper.insert(permission);
    }

    @Override
    @SentinelResource(value = "ums.updatePermission", fallback = "updateFallBack", fallbackClass = UmsPermissionServiceFallback.class)
    public int update(UmsPermission permission) {
        return umsPermissionMapper.updateByPrimaryKeySelective(permission);
    }

    @Override
    @SentinelResource(value = "ums.getAllPermissions", fallback = "getAllFallBack", fallbackClass = UmsPermissionServiceFallback.class)
    public List<UmsPermission> getAll() {
        return umsPermissionMapper.selectAll();
    }

    @Override
    @SentinelResource(value = "ums.getAllNormalPermissions", fallback = "getAllNormalFallBack", fallbackClass = UmsPermissionServiceFallback.class)
    public List<UmsPermission> getAllNormal() {
        UmsPermission permission = new UmsPermission();
        permission.setStatus(1);
        return umsPermissionMapper.select(permission);
    }

    @Override
    @SentinelResource(value = "ums.getAllDeletedPermissions", fallback = "getAllDeletedFallBack", fallbackClass = UmsPermissionServiceFallback.class)
    public List<UmsPermission> getAllDeleted() {
        UmsPermission permission = new UmsPermission();
        permission.setStatus(0);
        return umsPermissionMapper.select(permission);
    }


}
