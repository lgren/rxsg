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
public class CfgHero extends Model<CfgHero> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer npcid;

    private Integer sex;

    private Integer face;

    private Integer cid;

    private Integer level;

    private Double exp;

    private Integer affairsAdd;

    private Integer braveryAdd;

    private Integer wisdomAdd;

    private Integer affairsBase;

    private Integer braveryBase;

    private Integer wisdomBase;

    private Integer loyalty;

    private Double goldNeed;

    /**
     * 将领类型
     */
    private Integer herotype;

    private Integer commandBase;

    private Integer commandAddOn;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
