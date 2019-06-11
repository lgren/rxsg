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
public class LogActivityRankDay extends Model<LogActivityRankDay> {

    private static final long serialVersionUID = 1L;

    /**
     * 活动ID，参考cfg_activity_rank
     */
    private Integer actid;

    /**
     * 活动第几日
     */
    private Integer day;

    /**
     * 该次活动的排名
     */
    private Integer rank;

    /**
     * 用户UID
     */
    private Integer uid;

    /**
     * 用户君主名
     */
    private String name;

    private String sort3;

    private String sort4;

    private String sort5;

    /**
     * 是否已经领奖，0未领奖，1已经领奖
     */
    private Integer reward;

    /**
     * 领取时间
     */
    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.actid;
    }

}
