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
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgArmor extends Model<CfgArmor> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    /**
     * 部件
     * 1：头部
     * 2：颈部
     * 3：肩部
     * 4：胸部
     * 5：背部
     * 6：腰部
     * 7：手臂
     * 8：脚部
     * 9：手指
     * 10：饰品
     * 11：武器
     * 12：坐骑
     */
    private Integer part;

    /**
     * 装备类别
     * 1：灰装
     * 2：白装
     * 3：绿装
     * 4：蓝装
     * 5：紫装
     * 6：橙装
     * 7：红装
     */
    private Integer type;

    /**
     * 装备属性
     * N,type,value,type,value,type,value....
     * type说明
     * 1：统帅
     * 2：内政
     * 3：勇武
     * 4：智谋
     * 5：体力
     * 6：精力
     * 7：生命
     * 8：攻击
     * 9：防御
     * 10：射程
     * 11：速度
     * 12：负重
     */
    private String attribute;

    /**
     * 要求武将最低等级
     */
    private Integer heroLevel;

    /**
     * 装备的最大耐久
     */
    private Integer oriHpMax;

    /**
     * 备装的价值
     */
    private Integer value;

    private Integer image;

    /**
     * 是否撤用
     */
    private Integer inuse;

    /**
     * 是否会宝箱掉落，０表示用不掉落，１表示会掉落
     */
    private Integer boxDrop;

    /**
     * 是否会战斗掉落，０表示用不掉落，１表示会掉落
     */
    private Integer battleDrop;

    /**
     * 描述
     */
    private String description;

    private String special;

    /**
     * 等级
     */
    private Integer level;

    private Integer bid;

    private Integer tieid;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
