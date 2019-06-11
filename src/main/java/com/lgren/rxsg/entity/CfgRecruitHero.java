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
public class CfgRecruitHero extends Model<CfgRecruitHero> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 对应cfg_act中的actid
     */
    private String actid;

    private String heroname;

    /**
     * 将领类型
     */
    private Integer herotype;

    private Integer minFace;

    private Integer maxFace;

    private Integer minAffairsBase;

    private Integer maxAffairsBase;

    private Integer minBraveryBase;

    private Integer maxBraveryBase;

    private Integer minWisdomBase;

    private Integer maxWisdomBase;

    private Integer minLoyalty;

    private Integer maxLoyalty;

    /**
     * 概率
     */
    private Integer rate;

    private Integer sex;

    /**
     * 单个玩家拥有同名活动将领的数量上限
     */
    private Integer userhavecnt;

    private Integer gentype;

    private Integer genid;

    private Integer level;

    private Integer minLevel;

    private Integer maxLevel;

    private Integer minCommandBase;

    private Integer maxCommandBase;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
