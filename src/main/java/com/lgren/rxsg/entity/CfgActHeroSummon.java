package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class CfgActHeroSummon extends Model<CfgActHeroSummon> {

    private static final long serialVersionUID = 1L;

    /**
     * 活动将领类型,唯一指定一个活动将
     */
    private Integer herotype;

    /**
     * 物品类别 2：宝物//5：任务//6：装备
     */
    private Integer sort;

    /**
     * 物品类型ID
     */
    private Integer type;

    private String name;

    private Integer count;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
