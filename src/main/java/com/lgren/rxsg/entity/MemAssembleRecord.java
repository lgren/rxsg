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
public class MemAssembleRecord extends Model<MemAssembleRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer fromuid;

    private Integer touid;

    /**
     * 1为攻击方胜利，0为防守方胜利
     */
    private Integer flag;

    /**
     * 奖励id
     */
    private Integer rewardid;

    /**
     * 奖励数量
     */
    private Integer rewardcount;

    /**
     * 攻击方连胜次数
     */
    private Integer times;

    /**
     * 攻击后攻击方排名
     */
    private Integer attackrank;

    /**
     * 攻击后防守方排名
     */
    private Integer resistrank;

    /**
     * 防守方将领的修为等级
     */
    @TableField("rKingLevel")
    private Integer rKingLevel;

    /**
     * 攻击后双方是否改变的排名
     */
    private Integer ischange;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
