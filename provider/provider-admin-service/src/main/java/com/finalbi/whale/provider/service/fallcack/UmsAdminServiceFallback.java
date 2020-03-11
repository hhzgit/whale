package com.finalbi.whale.provider.service.fallcack;

import com.finalbi.whale.provider.domain.UmsAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户服务提供者熔断器
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/7
 */
public class UmsAdminServiceFallback {

    private static final Logger logger = LoggerFactory.getLogger(UmsAdminServiceFallback.class);

    /**
     * 根据用户名获取用户信息
     *
     * @param userName {@code String} 用户名
     * @param ex       {@code Throwable} 异常信息
     * @return {@link UmsAdmin} 熔断后的固定结果
     */
    public static UmsAdmin getByUserNameFallBack(String userName, Throwable ex) {
        logger.warn("Invoke getByUserNameFallBack:" + ex.getClass().getTypeName());
        return null;
    }

    /**
     * 根据用户 Id 获取用户
     *
     * @param userId {@code Long} 用户Id
     * @param ex {@code Throwable} 异常信息
     * @return {@link UmsAdmin} 熔断后固定返回null
     */
    public static UmsAdmin getUserByUserIdFallBack(Long userId, Throwable ex) {
        logger.warn("Invoke getUserByUserIdFallBack:" + ex.getClass().getTypeName());
        return null;
    }

    /**
     * 新增用户熔断
     *
     * @param umsAdmin {@link UmsAdmin}
     * @param ex {@code Throwable} 异常信息
     * @return {@code int} 熔断后固定返回 0（新增失败）
     */
    public static int insertFallBack(UmsAdmin umsAdmin, Throwable ex) {
        logger.warn("Invoke insertFallBack:" + ex.getClass().getTypeName());
        return 0;
    }
}
