package com.finalbi.whale.provider.mapper;

import com.finalbi.whale.provider.domain.UmsRole;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface UmsRoleMapper extends MyMapper<UmsRole> {
    List<UmsRole> getUserRoles(@Param("userId") Long userId);
}