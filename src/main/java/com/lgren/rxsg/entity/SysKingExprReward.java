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
 * 君主历练奖励表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysKingExprReward extends Model<SysKingExprReward> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    /**
     * 历练碰到女将领gid
     */
    private Integer hid;

    /**
     * 奖励产生时间
     */
    private Integer time;

    /**
     * 否是领取奖励，1领取，0未领取
     */
    @TableField("getFlag")
    private Integer getFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
