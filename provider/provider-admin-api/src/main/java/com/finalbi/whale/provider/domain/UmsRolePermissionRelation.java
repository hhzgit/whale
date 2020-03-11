package com.finalbi.whale.provider.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * 角色权限关系
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/19
 */
@Data
@Table(name = "ums_role_permission_relation")
public class UmsRolePermissionRelation implements Serializable {

    private static final long serialVersionUID = -5205300313942914967L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "permission_id")
    private Long permissionId;
}