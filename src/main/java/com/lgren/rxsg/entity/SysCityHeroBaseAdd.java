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
 * 将领基础属性永久加点
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysCityHeroBaseAdd extends Model<SysCityHeroBaseAdd> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 英雄ID
     */
    private Integer hid;

    /**
     * 归属哪个玩家，如果是NPC的话，为0
     */
    private Integer uid;

    /**
     * 基础统率加点
     */
    private Integer commandBaseAddOn;

    /**
     * 基础内政加点
     */
    private Integer affairsBaseAddOn;

    /**
     * 基础勇武加点
     */
    private Integer braveryBaseAddOn;

    /**
     * 基础智谋加点
     */
    private Integer wisdomBaseAddOn;

    /**
     * 基础加点类型 1:将领历练获得 2：武魂加成
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
