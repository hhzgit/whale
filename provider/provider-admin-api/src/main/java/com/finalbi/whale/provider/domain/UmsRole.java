package com.finalbi.whale.provider.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 用户角色
 * <p>
 * Description:
 * </p>
 *
 * @author hal
 * @date 2019/11/19
 */
@Data
@Table(name = "ums_role")
public class UmsRole implements Serializable {

    private static final long serialVersionUID = -3556544050809677315L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 后台用户数量
     */
    @Column(name = "admin_count")
    private Integer adminCount;

    /**
     * 创建时间
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 启用状态：0->禁用；1->启用
     */
    @Column(name = "`status`")
    private Integer status;

    @Column(name = "sort")
    private Integer sort;
}