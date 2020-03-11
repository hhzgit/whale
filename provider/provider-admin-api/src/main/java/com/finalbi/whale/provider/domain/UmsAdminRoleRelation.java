package com.finalbi.whale.provider.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * 用户角色关系
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/19
 */
@Data
@Table(name = "ums_admin_role_relation")
public class UmsAdminRoleRelation implements Serializable {

    private static final long serialVersionUID = 7796281491262757991L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "admin_id")
    private Long adminId;

    @Column(name = "role_id")
    private Long roleId;
}