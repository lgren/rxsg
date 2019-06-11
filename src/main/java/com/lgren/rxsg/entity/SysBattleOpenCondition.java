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
public class SysBattleOpenCondition extends Model<SysBattleOpenCondition> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 场战ID
     */
    @TableField("battleId")
    private Integer battleId;

    /**
     * 依赖战场ID
     */
    @TableField("dependBattleId")
    private Integer dependBattleId;

    /**
     * 其他条件
     */
    @TableField("otherCondition")
    private String otherCondition;

    /**
     * 标记依赖的条件是否处在正在被实现的阶段
     */
    @TableField("isConditionDoing")
    private Integer isConditionDoing;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
