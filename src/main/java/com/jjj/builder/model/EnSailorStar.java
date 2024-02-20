package com.jjj.builder.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 水手-星级
 *
 * @author 江南
 * @since 2024-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EnSailorStar implements Serializable {

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
     * 水手星级
     */
    @NotNull(message = "水手星级不能为空~")
    @Min(value = 1, message = "水手星级不能小于1~")
    private Integer level;

    /**
     * 经验值[null表示最大星级]
     */
    @Min(value = 1, message = "经验值不能小于1~")
    private Long maxExp;

    /**
     * 攻击力
     */
    @NotNull(message = "攻击力不能为空~")
    @Min(value = 0, message = "防御力不能小于0~")
    private Integer atk;

    /**
     * 魔法攻击
     */
    @NotNull(message = "魔法攻击不能为空~")
    @Min(value = 0, message = "魔法抗性不能小于0~")
    private Integer magicAtk;

    /**
     * 防御力
     */
    @NotNull(message = "防御力不能为空~")
    @Min(value = 0, message = "防御力不能小于0~")
    private Integer def;

    /**
     * 魔法抗性
     */
    @NotNull(message = "魔法抗性不能为空~")
    @Min(value = 0, message = "魔法抗性不能小于0~")
    private Integer magicDef;

    /**
     * 闪避值
     */
    @NotNull(message = "闪避值不能为空~")
    @Min(value = 0, message = "闪避值不能小于0~")
    private BigDecimal dodge;

    /**
     * 暴击率
     */
    @NotNull(message = "暴击率不能为空~")
    @Min(value = 0, message = "暴击率不能小于0~")
    private BigDecimal critRate;

    /**
     * 暴击伤害
     */
    @NotNull(message = "暴击伤害不能为空~")
    @Min(value = 0, message = "暴击伤害不能小于0~")
    private BigDecimal critDmg;

    /**
     * 觉醒加成
     */
    @NotNull(message = "唤醒加成不能为空~")
    @Min(value = 0, message = "唤醒加成不能小于0~")
    private BigDecimal awakenAddition;

    /**
     * 创建时间
     */
    private Date createTime;


}
