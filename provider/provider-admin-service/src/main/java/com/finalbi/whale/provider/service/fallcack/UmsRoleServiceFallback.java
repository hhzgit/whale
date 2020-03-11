package com.finalbi.whale.provider.service.fallcack;

import com.finalbi.whale.provider.domain.UmsRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 角色管理熔断
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/19
 */
public class UmsRoleServiceFallback {

    private static final Logger logger = LoggerFactory.getLogger(UmsRoleServiceFallback.class);

    /**
     * 新增角色熔断
     *
     * @param role {@link UmsRole}
     * @param ex {@code Throwable} 异常信息
     * @return {@code int} 熔断后固定返回 0（新增失败）
     */
    public static int insertFallBack(UmsRole role, Throwable ex) {
        logger.warn("Invoke insertFallBack:" + ex.getClass().getTypeName());
        return 0;
    }

    /**
     * 更新角色熔断
     *
     * @param role {@link UmsRole}
     * @param ex {@code Throwable} 异常信息
     * @return {@code int} 熔断后固定返回 0（更新失败）
     */
    public static int updateFallBack(UmsRole role, Throwable ex) {
        logger.warn("Invoke updateFallBack:" + ex.getClass().getTypeName());
        return 0;
    }

    /**
     * 获取所有角色熔断
     *
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsRole} 固定返回null
     */
    public static List<UmsRole> getAllFallBack(Throwable ex) {
        logger.warn("Invoke getAllFallBack:" + ex.getClass().getTypeName());
        return null;
    }

    /**
     * 获取所有正常角色熔断
     *
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsRole} 固定返回null
     */
    public static List<UmsRole> getAllNormalFallBack(Throwable ex) {
        logger.warn("Invoke getAllNormalFallBack:" + ex.getClass().getTypeName());
        return null;
    }

    /**
     * 获取所有删除角色熔断
     *
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsRole} 固定返回null
     */
    public static List<UmsRole> getAllDeletedFallBack(Throwable ex) {
        logger.warn("Invoke getAllDeletedFallBack:" + ex.getClass().getTypeName());
        return null;
    }

    /**
     * 获取用户角色熔断
     *
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsRole} 固定返回null
     */
    public static List<UmsRole> getUserRolesFallBack(Throwable ex) {
        logger.warn("Invoke getUserRolesFallBack:" + ex.getClass().getTypeName());
        return null;
    }
}
