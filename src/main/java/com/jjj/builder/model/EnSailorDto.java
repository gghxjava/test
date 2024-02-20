package com.jjj.builder.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author 江南
 * @since 2024/1/9
 */
@Data
public class EnSailorDto {

    /**
     * 水手-ID
     */
    @NotNull(message = "水手ID不能为空~", groups = Update.class)
    @Null(message = "水手ID不能有值~", groups = Insert.class)
    private Long id;

    /**
     * 藏品ID
     */
    @NotNull(message = "藏品ID不能为空~")
    private Long nftId;

    /**
     * 是否支持补血[0-不支持,1-支持]
     */
    @NotNull(message = "是否支持补血不能为空~")
    private Boolean openHp;

    /**
     * 初始生命值
     */
    @NotNull(message = "初始生命值不能为空~")
    @Min(value = 0, message = "初始生命值不能小于0~")
    private BigDecimal hp;

    /**
     * 生命上限
     */
    @NotNull(message = "初始生命值不能为空~")
    @Min(value = 0, message = "初始生命值不能小于0~")
    private BigDecimal hpMax;

    /**
     * 生命值消耗速度[单位:/事件]
     */
    @NotNull(message = "生命值消耗速度不能为空~")
    @Min(value = 0, message = "生命值消耗速度不能小于0~")
    private BigDecimal hpSpeed;

    /**
     * 探索力
     */
    @NotNull(message = "探索力不能为空~")
    @Min(value = 0, message = "探索力不能小于0~")
    private Integer exploring;

    /**
     * 战力值
     */
    @NotNull(message = "战力值不能为空~")
    @Min(value = 0, message = "战力值不能小于0~")
    private Integer power;

    /**
     * 水手特效ID列表
     */
    private List<Long> effectIdList;

    /**
     * 星级数值列表
     */
    @NotNull(message = "星级数值设置不能为空~")
    @Size(min = 1, message = "星级数值设置不能小于1~")
    private List<EnSailorStar> sailorStarList;

    /**
     * 水手觉醒材料列表
     */
    @NotNull(message = "水手觉醒材料不能为空~")
    @Size(min = 1, message = "水手觉醒材料不能小于1~")
    private List<EnSailorAwaken> awakenList;


}
