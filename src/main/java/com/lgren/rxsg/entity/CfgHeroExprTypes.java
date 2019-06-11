package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 将领历练可选类型
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgHeroExprTypes extends Model<CfgHeroExprTypes> {

    private static final long serialVersionUID = 1L;

    private Integer type;

    /**
     * 历练名称
     */
    private String name;

    /**
     * 历练类型介绍
     */
    private String intro;

    /**
     * 可选通用语,用","隔开
     */
    private String descs;

    /**
     * 最少历练小时数
     */
    private Integer minHour;

    /**
     * 最多历练小时数
     */
    private Integer maxHour;

    /**
     * 最少携带元宝数
     */
    private Integer minCarraymoney;

    /**
     * 最多携带元宝数
     */
    private Integer maxCarraymoney;

    /**
     * 每小时消耗黄金数
     */
    private Integer hourGold;

    /**
     * 每小时获得经验值
     */
    private Integer hourExpr;

    /**
     * 每小时消耗元宝数
     */
    private Integer hourMoney;

    /**
     * 奇遇触发概率公式
     */
    private String rate;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
