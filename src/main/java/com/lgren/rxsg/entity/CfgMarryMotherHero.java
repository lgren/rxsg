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
 * 母亲数据表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgMarryMotherHero extends Model<CfgMarryMotherHero> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "hid", type = IdType.AUTO)
    private Integer hid;

    /**
     * 名字
     */
    private String name;

    /**
     * 斗将引用的将领hid
     */
    private Integer npcid;

    private Integer face;

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

    /**
     * 触发概率
     */
    private Integer rate;

    private String introduce;

    private Integer sex;

    /**
     * 送玫瑰的数量
     */
    private Integer count;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}
