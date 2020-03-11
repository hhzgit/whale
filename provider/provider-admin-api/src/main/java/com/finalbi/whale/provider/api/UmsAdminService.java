package com.finalbi.whale.provider.api;


import com.finalbi.whale.provider.domain.UmsAdmin;

/**
 * 用户管理服务
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/10/29
 */
public interface UmsAdminService{

    /**
     * 新增用户
     *
     * @param umsAdmin {@link UmsAdmin}
     * @return {@code int} 大于 0 则表示添加成功
     */
    int insert(UmsAdmin umsAdmin);

    /**
     * 获取用户
     *
     * @param umsAdmin {@link UmsAdmin}
     * @return {@link UmsAdmin}
     */
    UmsAdmin get(UmsAdmin umsAdmin);

    /**
     * 获取用户
     *
     * @param userName 用户名
     * @return {@link UmsAdmin}
     */
    UmsAdmin get(String userName);


    /**
     * 获取用户
     *
     * @param userId 用户Id
     * @return {@link UmsAdmin}
     */
    UmsAdmin get(Long userId);
}
