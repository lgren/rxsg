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
 * 
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysCityHero extends Model<SysCityHero> {

    private static final long serialVersionUID = 1L;

    /**
     * 英雄ID
     */
    @TableId(value = "hid", type = IdType.AUTO)
    private Integer hid;

    /**
     * 归属哪个玩家，如果是NPC的话，为0
     */
    private Integer uid;

    /**
     * 名字
     */
    private String name;

    private Integer npcid;

    private Integer sex;

    private Integer face;

    /**
     * 所属城池
     */
    private Integer cid;

    /**
     * 状态：0，空闲；1,城守；2,出征，3,战斗,4，驻守,5,俘虏
     */
    private Integer state;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 经验值
     */
    private Integer exp;

    /**
     * 领将的统率
     */
    private Integer commandBase;

    /**
     * 率统加成
     */
    private Integer commandAddOn;

    /**
     * 内政
     */
    private Integer affairsBase;

    /**
     * 勇武
     */
    private Integer braveryBase;

    /**
     * 智谋
     */
    private Integer wisdomBase;

    private Integer affairsAdd;

    private Integer braveryAdd;

    private Integer wisdomAdd;

    /**
     * 政内加成
     */
    private Integer affairsAddOn;

    /**
     * 勇武加成
     */
    private Integer braveryAddOn;

    /**
     * 智谋加成
     */
    private Integer wisdomAddOn;

    /**
     * 体力加成
     */
    private Integer forceMaxAddOn;

    /**
     * 精力加成
     */
    private Integer energyMaxAddOn;

    /**
     * 速度加成
     */
    private Integer speedAddOn;

    /**
     * 攻击加成
     */
    private Integer attackAddOn;

    /**
     * 防御加成
     */
    private Integer defenceAddOn;

    /**
     * 忠诚
     */
    private Integer loyalty;

    /**
     * 将领类型,0普通武将，1黄巾活动武将,2聚贤包开出武将,3-9圣诞武将
     */
    private Integer herotype;

    /**
     * 状态：0，健康；1，重伤；2，修养
     */
    private Integer heroHealth;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}
