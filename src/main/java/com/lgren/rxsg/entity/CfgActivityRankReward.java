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
public class CfgActivityRankReward extends Model<CfgActivityRankReward> {

    private static final long serialVersionUID = 1L;

    /**
     * 活动ID，参考cfg_activity_rank
     */
    private Integer actid;

    /**
     * 该档最低名次
     */
    private Integer minrank;

    /**
     * 该档最高名次
     */
    private Integer maxrank;

    /**
     * 该档奖励，跟礼券一样的规则
     */
    private String reward;


    @Override
    protected Serializable pkVal() {
        return this.actid;
    }

}
