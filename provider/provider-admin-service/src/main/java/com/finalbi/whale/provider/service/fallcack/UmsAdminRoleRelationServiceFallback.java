package com.finalbi.whale.provider.service.fallcack;

import com.finalbi.whale.provider.domain.UmsAdminRoleRelation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 用户角色关系管理服务熔断器
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/19
 */
public class UmsAdminRoleRelationServiceFallback {

    private static final Logger logger = LoggerFactory.getLogger(UmsAdminRoleRelationServiceFallback.class);

    /**
     * 新增用户角色关系熔断
     *
     * @param relation {@link UmsAdminRoleRelation}
     * @param ex {@code Throwable} 异常信息
     * @return {@code int} 熔断后固定返回 0（新增失败）
     */
    public static int insertFallback(UmsAdminRoleRelation relation, Throwable ex) {
        logger.warn("Invoke insertFallback:" + ex.getClass().getTypeName());
        return 0;
    }

    /**
     * 删除用户角色关系熔断
     *
     * @param relation {@link UmsAdminRoleRelation}
     * @param ex {@code Throwable} 异常信息
     * @return {@code int} 熔断后固定返回 0（删除失败）
     */
    public static int deleteFallback(UmsAdminRoleRelation relation, Throwable ex) {
        logger.warn("Invoke deleteFallback:" + ex.getClass().getTypeName());
        return 0;
    }

    /**
     * 获取用户角色关系熔断
     *
     * @param userId {@code long} 用户Id
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsAdminRoleRelation} 熔断后固定返回 null
     */
    public static List<UmsAdminRoleRelation> getUserRoleRelationsFallback(Long userId, Throwable ex) {
        logger.warn("Invoke getUserRoleRelationsFallback:" + ex.getClass().getTypeName());
        return null;
    }
}
