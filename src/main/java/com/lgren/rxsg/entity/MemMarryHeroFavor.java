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
 * 玩家与女将的好感度关系表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MemMarryHeroFavor extends Model<MemMarryHeroFavor> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    /**
     * 夫人hid
     */
    private Integer hid;

    /**
     * 好感度
     */
    private Integer favor;

    /**
     * 0：谈情说爱阶段，1：夫人赠送礼品阶段,2：怀孕阶段，3：可以接生了
     */
    private Integer state;

    /**
     * 该女将作为夫人拥有孩子的个数
     */
    private Integer count;

    /**
     * 生完孩子后的冷却结束
     */
    @TableField("coolingEndtime")
    private Integer coolingEndtime;

    /**
     * 提亲冷却时间
     */
    @TableField("proposeCoolTime")
    private Integer proposeCoolTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
