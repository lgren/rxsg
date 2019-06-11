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
public class CfgAssembleReward extends Model<CfgAssembleReward> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 奖励名称
     */
    private String name;

    /**
     * 奖励物品gid
     */
    private Integer gid;

    /**
     * 奖励基数
     */
    private Integer base;

    /**
     * 0物品，1装备，2资源
     */
    private Integer type;

    private Integer rate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
