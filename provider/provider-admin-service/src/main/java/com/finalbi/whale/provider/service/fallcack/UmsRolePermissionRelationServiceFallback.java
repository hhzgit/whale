package com.finalbi.whale.provider.service.fallcack;

import com.finalbi.whale.provider.domain.UmsRolePermissionRelation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 角色权限管理服务熔断器
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/20
 */
public class UmsRolePermissionRelationServiceFallback {

    private static final Logger logger = LoggerFactory.getLogger(UmsRolePermissionRelationServiceFallback.class);

    /**
     * 新增角色权限关系熔断
     *
     * @param relation {@link UmsRolePermissionRelation}
     * @param ex {@code Throwable} 异常信息
     * @return {@code int} 熔断后固定返回 0（新增失败）
     */
    public static int insertFallBack(UmsRolePermissionRelation relation, Throwable ex) {
        logger.warn("Invoke insertFallBack:" + ex.getClass().getTypeName());
        return 0;
    }

    /**
     * 删除角色权限关系熔断
     *
     * @param relation {@link UmsRolePermissionRelation}
     * @param ex {@code Throwable} 异常信息
     * @return {@code int} 熔断后固定返回 0（删除失败）
     */
    public static int deleteFallBack(UmsRolePermissionRelation relation, Throwable ex) {
        logger.warn("Invoke deleteFallBack:" + ex.getClass().getTypeName());
        return 0;
    }

    /**
     * 获取角色的权限关系熔断
     *
     * @param roleId {@code int} 角色Id
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsRolePermissionRelation} 熔断后固定返回 null
     */
    public static List<UmsRolePermissionRelation> getRolePermissionRelationsFallBack(int roleId, Throwable ex) {
        logger.warn("Invoke getRolePermissionRelationsFallBack:" + ex.getClass().getTypeName());
        return null;
    }

}
