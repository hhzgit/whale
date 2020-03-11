package com.finalbi.whale.provider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.finalbi.whale.provider.domain.UmsAdminRoleRelation;
import com.finalbi.whale.provider.service.fallcack.UmsAdminRoleRelationServiceFallback;
import javax.annotation.Resource;
import com.finalbi.whale.provider.mapper.UmsAdminRoleRelationMapper;
import com.finalbi.whale.provider.api.UmsAdminRoleRelationService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service(version = "1.0.0")
public class UmsAdminRoleRelationServiceImpl implements UmsAdminRoleRelationService{

    @Resource
    private UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;

    @Override
    @SentinelResource(value = "ums.insertAdminRoleRelation", fallback = "insertFallback", fallbackClass = UmsAdminRoleRelationServiceFallback.class)
    public int insert(UmsAdminRoleRelation relation) {
        return umsAdminRoleRelationMapper.insert(relation);
    }

    @Override
    @SentinelResource(value = "ums.deleteAdminRoleRelation", fallback = "deleteFallback", fallbackClass = UmsAdminRoleRelationServiceFallback.class)
    public int delete(UmsAdminRoleRelation relation) {
        return umsAdminRoleRelationMapper.delete(relation);
    }

    @Override
    @SentinelResource(value = "ums.getUserRoleRelations", fallback = "getUserRoleRelationsFallback", fallbackClass = UmsAdminRoleRelationServiceFallback.class)
    public List<UmsAdminRoleRelation> getUserRoleRelations(Long userId) {
        UmsAdminRoleRelation umsAdminRoleRelation = new UmsAdminRoleRelation();
        umsAdminRoleRelation.setAdminId(userId);
        return umsAdminRoleRelationMapper.select(umsAdminRoleRelation);
    }

}
