package com.finalbi.whale.provider.api;


import com.finalbi.whale.provider.domain.UmsRole;

import java.util.List;

/**
 * 用户角色管理
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/19
 */
public interface UmsRoleService{

    /**
     * 新增角色
     *
     * @param role {@link UmsRole}
     * @return {@code int} 大于 0 则表示添加成功
     */
    int insert(UmsRole role);

    /**
     * 更新角色
     *
     * @param role {@link UmsRole}
     * @return {@code int} 大于 0 则表示修改成功
     */
    int update(UmsRole role);

    /**
     * 获取所有角色
     *
     * @return {@link UmsRole}
     */
    List<UmsRole> getAll();

    /**
     * 获取所有正常状态角色
     *
     * @return {@link UmsRole}
     */
    List<UmsRole> getAllNormal();


    /**
     * 获取所有删除状态角色
     *
     * @return {@link UmsRole}
     */
    List<UmsRole> getAllDeleted();


    /**
     * 获取用户角色
     *
     * @param userId {@code long} 用户id
     * @return {@link UmsRole}
     */
    List<UmsRole> getUserRoles(Long userId);
}
