package com.finalbi.whale.provider.api;


import com.finalbi.whale.provider.domain.UmsRolePermissionRelation;

import java.util.List;

/**
 * 角色权限管理
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/19
 */
public interface UmsRolePermissionRelationService{

    /**
     * 新增角色权限关系
     *
     * @param relation {@link UmsRolePermissionRelation}
     * @return {@code int} 大于 0 表示新增成功
     */
    int insert(UmsRolePermissionRelation relation);

    /**
     * 删除角色权限关系
     *
     * @param relation {@link UmsRolePermissionRelation}
     * @return {@code int} 大于 0 表示删除成功
     */
    int delete(UmsRolePermissionRelation relation);

    /**
     * 获取角色的关联权限
     *
     * @param roleId {@code Long} 角色Id
     * @return {@link UmsRolePermissionRelation}
     */
    List<UmsRolePermissionRelation> getRolePermissionRelations(Long roleId);
}
