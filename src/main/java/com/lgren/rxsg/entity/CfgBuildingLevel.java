package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 建筑的级别设定
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgBuildingLevel extends Model<CfgBuildingLevel> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer bid;

    private Integer level;

    private Double upgradeWood;

    private Double upgradeRock;

    private Double upgradeIron;

    private Double upgradeFood;

    private Double upgradeGold;

    private Integer upgradePeople;

    private Integer upgradeTime;

    private Integer usingPeople;

    private String description;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
