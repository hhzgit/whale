package com.finalbi.whale.provider.api;


import com.finalbi.whale.provider.domain.UmsAdminRoleRelation;

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
public interface UmsAdminRoleRelationService{

    /**
     * 新增用户角色关联
     *
     * @param relation {@link UmsAdminRoleRelation}
     * @return {@code int} 大于 0 表示新增成功
     */
    int insert(UmsAdminRoleRelation relation);

    /**
     * 删除用户角色关系
     *
     * @param relation {@link UmsAdminRoleRelation}
     * @return {@code int} 大于 0 表示删除成功
     */
    int delete(UmsAdminRoleRelation relation);

    /**
     * 获取用户的角色关联关系
     *
     * @param userId {@code long} 用户Id
     * @return {@link UmsAdminRoleRelation}
     */
    List<UmsAdminRoleRelation> getUserRoleRelations(Long userId);
}
