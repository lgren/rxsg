package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgBattleField extends Model<CfgBattleField> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    /**
     * 0:剧情，1:据点
     */
    private Integer type;

    /**
     * 最大人数
     */
    private Integer maxpeople;

    /**
     * 战场说明
     */
    private String content;

    /**
     * 最高等级
     */
    private Integer maxlevel;

    /**
     * 战场指南
     */
    private String todo;

    private String reward;

    /**
     * 势力个数
     */
    private Integer unionCount;

    /**
     * 0 未开放 1 玩家开放中 2 系统开放中
     */
    private Integer state;

    private Integer maxtime;

    private Integer minpeople;

    private Integer maxcount;

    private Integer maxdaycount;

    /**
     * 玩家所属阵营
     */
    private Integer userUnionid;

    /**
     * 战场开启条件说明
     */
    @TableField("openCondition")
    private String openCondition;

    /**
     * 战场门票（针对goods表）
     */
    @TableField("demandGoods")
    private String demandGoods;

    /**
     * 战场门票（针对things表）
     */
    @TableField("demandThings")
    private String demandThings;

    /**
     * 战场爵位要求
     */
    @TableField("demandNobility")
    private Integer demandNobility;

    /**
     * 用于战场在一定时间后强制开启
     */
    @TableField("openTime")
    private Integer openTime;

    /**
     * 加入要求
     */
    @TableField("joinDemand")
    private String joinDemand;

    /**
     * 战场门票
     */
    @TableField("battleTicket")
    private String battleTicket;

    /**
     * 胜利条件
     */
    @TableField("winCondition")
    private String winCondition;

    /**
     * 失败条件
     */
    @TableField("loseCondition")
    private String loseCondition;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
