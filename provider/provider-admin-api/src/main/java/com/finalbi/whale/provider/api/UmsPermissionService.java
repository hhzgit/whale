package com.finalbi.whale.provider.api;


import com.finalbi.whale.provider.domain.UmsPermission;

import java.util.List;

/**
 * 用户权限服务
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/10/29
 */
public interface UmsPermissionService{

    /**
     * 获取用户权限
     *
     * @param userId {@code long} 用户id
     * @return {@link UmsPermission}
     */
    List<UmsPermission> getUserPermissions(Long userId);

    /**
     * 新增权限
     *
     * @param permission {@link UmsPermission}
     * @return {@code int} 大于 0 则表示添加成功
     */
    int insert(UmsPermission permission);

    /**
     * 修改权限
     *
     * @param permission {@link UmsPermission}
     * @return {@code int} 大于 0 则表示添加成功
     */
    int update(UmsPermission permission);


    /**
     * 获取所有权限列表
     *
     * @return {@link UmsPermission}
     */
    List<UmsPermission> getAll();

    /**
     * 获取所有正常状态权限
     *
     * @return {@link UmsPermission}
     */
    List<UmsPermission> getAllNormal();

    /**
     * 获取所有删除状态权限
     *
     * @return {@link UmsPermission}
     */
    List<UmsPermission> getAllDeleted();
}
