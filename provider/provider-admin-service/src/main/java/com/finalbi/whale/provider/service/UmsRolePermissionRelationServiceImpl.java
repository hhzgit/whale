package com.finalbi.whale.provider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.finalbi.whale.provider.domain.UmsRolePermissionRelation;
import com.finalbi.whale.provider.service.fallcack.UmsRolePermissionRelationServiceFallback;
import javax.annotation.Resource;
import com.finalbi.whale.provider.mapper.UmsRolePermissionRelationMapper;
import com.finalbi.whale.provider.api.UmsRolePermissionRelationService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service(version = "1.0.0")
public class UmsRolePermissionRelationServiceImpl implements UmsRolePermissionRelationService{

    @Resource
    private UmsRolePermissionRelationMapper umsRolePermissionRelationMapper;

    @Override
    @SentinelResource(value = "ums.insertRolePermissionRelation", fallback = "insertFallBack", fallbackClass = UmsRolePermissionRelationServiceFallback.class)
    public int insert(UmsRolePermissionRelation relation) {
        return umsRolePermissionRelationMapper.insert(relation);
    }

    @Override
    @SentinelResource(value = "ums.deleteRolePermissionRelation", fallback = "deleteFallBack", fallbackClass = UmsRolePermissionRelationServiceFallback.class)
    public int delete(UmsRolePermissionRelation relation) {
        return umsRolePermissionRelationMapper.delete(relation);
    }

    @Override
    @SentinelResource(value = "ums.getRolePermissionRelations", fallback = "getRolePermissionRelationsFallBack", fallbackClass = UmsRolePermissionRelationServiceFallback.class)
    public List<UmsRolePermissionRelation> getRolePermissionRelations(Long roleId) {
        UmsRolePermissionRelation umsRolePermissionRelation = new UmsRolePermissionRelation();
        umsRolePermissionRelation.setRoleId(roleId);
        return umsRolePermissionRelationMapper.select(umsRolePermissionRelation);
    }
}
