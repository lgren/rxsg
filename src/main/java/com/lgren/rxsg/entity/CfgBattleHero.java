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
public class CfgBattleHero extends Model<CfgBattleHero> {

    private static final long serialVersionUID = 1L;

    /**
     * 英雄ID
     */
    private Integer bid;

    /**
     * 名字
     */
    private String name;

    private Integer sex;

    private Integer face;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 领将的统率
     */
    private Integer command;

    /**
     * 内政
     */
    private Integer affairs;

    /**
     * 勇武
     */
    private Integer bravery;

    /**
     * 智谋
     */
    private Integer wisdom;

    @TableId(value = "hid", type = IdType.AUTO)
    private Integer hid;

    private Integer energy;

    private Integer force;

    private Integer rangeadd;

    private Integer speedadd;

    private Integer armorDropType;

    private Integer canChat;

    private Integer noAttack;

    /**
     * 对应的cfg_npc_hero中的id
     */
    private Integer npcHeroId;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}
