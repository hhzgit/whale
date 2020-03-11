package com.finalbi.whale.provider.mapper;

import com.finalbi.whale.provider.domain.UmsPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface UmsPermissionMapper extends MyMapper<UmsPermission> {
    List<UmsPermission> getUserPermission(@Param("userId") Long userId);
}