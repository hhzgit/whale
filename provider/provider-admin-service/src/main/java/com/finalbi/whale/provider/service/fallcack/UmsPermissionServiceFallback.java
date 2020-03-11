package com.finalbi.whale.provider.service.fallcack;

import com.finalbi.whale.provider.domain.UmsPermission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 用户权限管理服务熔断器
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/19
 */
public class UmsPermissionServiceFallback {

    private static final Logger logger = LoggerFactory.getLogger(UmsPermissionServiceFallback.class);

    /**
     * 获取用户权限熔断
     *
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsPermission} 熔断后固定返回null
     */
    public static List<UmsPermission> getUserPermissionsFallBack(Throwable ex) {
        logger.warn("Invoke getUserPermissionsFallBack:" + ex.getClass().getTypeName());
        return null;
    }

    /**
     * 新增权限熔断
     *
     * @param permission {@link UmsPermission}
     * @param ex {@code Throwable} 异常信息
     * @return {@code int} 熔断后固定返回 0（新增失败）
     */
    public static int insertFallBack(UmsPermission permission, Throwable ex) {
        logger.warn("Invoke insertFallBack:" + ex.getClass().getTypeName());
        return 0;
    }

    /**
     * 跟新权限熔断
     *
     * @param permission {@link UmsPermission}
     * @param ex {@code Throwable} 异常信息
     * @return {@code int} 熔断后固定返回 0（更新失败）
     */
    public static int updateFallBack(UmsPermission permission, Throwable ex) {
        logger.warn("Invoke updateFallBack:" + ex.getClass().getTypeName());
        return 0;
    }

    /**
     * 获取所有权限熔断
     *
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsPermission} 熔断后固定返回null
     */
    public static List<UmsPermission> getAllFallBack(Throwable ex) {
        logger.warn("Invoke getAllFallBack:" + ex.getClass().getTypeName());
        return null;
    }

    /**
     * 获取所有正常状态权限熔断
     *
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsPermission} 熔断后固定返回null
     */
    public static List<UmsPermission> getAllNormalFallBack(Throwable ex) {
        logger.warn("Invoke getAllNormalFallBack:" + ex.getClass().getTypeName());
        return null;
    }

    /**
     * 获取所有删除状态权限熔断
     *
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsPermission} 熔断后固定返回null
     */
    public static List<UmsPermission> getAllDeletedFallBack(Throwable ex) {
        logger.warn("Invoke getAllDeletedFallBack:" + ex.getClass().getTypeName());
        return null;
    }
}
