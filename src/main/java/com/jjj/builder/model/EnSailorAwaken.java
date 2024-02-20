package com.jjj.builder.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 水手-觉醒材料
 *
 * @author 江南
 * @since 2024-01-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EnSailorAwaken implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 水手ID
     */
    private Long sailorId;

    /**
     * 账户类型[AccountTypeEnum]
     */
    private String accountType;

    /**
     * 材料ID
     */
    private Long materialId;

    /**
     * 材料名称
     */
    private String title;

    /**
     * 材料图片
     */
    private String img;

    /**
     * 数量
     */
    @NotNull(message = "数量不能为空~")
    @Min(value = 0, message = "数量不能小于0~")
    private BigDecimal number;

    /**
     * 创建时间
     */
    private Date createTime;


}
