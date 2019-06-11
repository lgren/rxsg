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
 * 玩家孩子数据表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserChild extends Model<SysUserChild> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "hid", type = IdType.AUTO)
    private Integer hid;

    private Integer uid;

    /**
     * 名字
     */
    private String name;

    private Integer sex;

    private Integer face;

    /**
     * 领将的统率
     */
    private Integer commandBase;

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

    /**
     * 统率培养值
     */
    private Integer commandAdd;

    /**
     * 内政培养值
     */
    private Integer affairsAdd;

    /**
     * 勇武培养值
     */
    private Integer braveryAdd;

    /**
     * 智谋培养值
     */
    private Integer wisdomAdd;

    /**
     * 七星早产儿属性加成
     */
    private Integer qixinMultip;

    /**
     * 七星早产儿属性加成
     */
    private Integer wenpoMultip;

    /**
     * 成长值
     */
    private Integer upgradeValue;

    /**
     * 0：未改名，1：已经改名
     */
    private Integer isChange;

    /**
     * 转化成将领的hid
     */
    private Integer outHid;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}
