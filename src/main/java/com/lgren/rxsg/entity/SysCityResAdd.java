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
public class SysCityResAdd extends Model<SysCityResAdd> {

    private static final long serialVersionUID = 1L;

    /**
     * 城池ID
     */
    private Integer cid;

    /**
     * 粮食生产比例
     */
    private Integer foodRate;

    /**
     * 木材生产比例
     */
    private Integer woodRate;

    /**
     * 石料生产比例
     */
    private Integer rockRate;

    /**
     * 铁锭生产比例
     */
    private Integer ironRate;

    private Integer foodStore;

    private Integer woodStore;

    private Integer rockStore;

    private Integer ironStore;

    /**
     * 野地对粮食加成
     */
    private Integer fieldFoodAdd;

    /**
     * 野地对木材加成
     */
    private Integer fieldWoodAdd;

    /**
     * 野地对石料加成
     */
    private Integer fieldRockAdd;

    /**
     * 野地对铁锭加成
     */
    private Integer fieldIronAdd;

    /**
     * 物品对粮食加成
     */
    private Integer goodsFoodAdd;

    /**
     * 物品对木材加成
     */
    private Integer goodsWoodAdd;

    private Integer goodsRockAdd;

    private Integer goodsIronAdd;

    private Integer chiefAdd;

    /**
     * 资源生产率相关的数据修改过了
     */
    private Integer resourceChanging;

    private Integer skillFoodAdd;

    private Integer skillWoodAdd;

    private Integer skillRockAdd;

    private Integer skillIronAdd;

    private Integer skillGoldAdd;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}
