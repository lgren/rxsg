package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 玩家拥有的所有城市
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MemCityResourceBak extends Model<MemCityResourceBak> {

    private static final long serialVersionUID = 1L;

    /**
     * 城池ID
     */
    private Integer cid;

    private Integer morale;

    private Integer moraleStable;

    private Integer complaint;

    private Integer tax;

    /**
     * 库存木材
     */
    private Double wood;

    /**
     * 木材产量
     */
    private Double woodAdd;

    private Double woodMax;

    /**
     * 库存石材
     */
    private Double rock;

    /**
     * 石材产量
     */
    private Double rockAdd;

    private Double rockMax;

    /**
     * 库存铁锭
     */
    private Double iron;

    /**
     * 铁锭产量
     */
    private Double ironAdd;

    private Double ironMax;

    /**
     * 库存粮食
     */
    private Double food;

    /**
     * 粮食产量
     */
    private Double foodAdd;

    private Double foodArmyUse;

    private Double foodMax;

    /**
     * 库存黄金
     */
    private Double gold;

    /**
     * 将领薪水
     */
    private Double heroFee;

    /**
     * 黄金上限
     */
    private Double goldMax;

    /**
     * 黄金产量分倍率
     */
    private Integer goldRate;

    /**
     * 当前总人口
     */
    private Integer people;

    /**
     * 人品稳定值
     */
    private Integer peopleStable;

    private Integer peopleWorking;

    private Integer peopleBuilding;

    private Integer peopleMax;

    private Integer chiefLoyalty;

    private Integer changing;

    private Integer lastupdate;

    /**
     * ０表示正常，１表示休假
     */
    private Integer vacation;

    /**
     * ０表示正常，１表示封禁
     */
    private Integer forbidden;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}
