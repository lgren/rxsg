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
public class CfgActivityRank extends Model<CfgActivityRank> {

    private static final long serialVersionUID = 1L;

    /**
     * 活动ID，参考cfg_act
     */
    private Integer actid;

    /**
     * 排行活动开始时间
     */
    private Integer starttime;

    /**
     * 活动结束时间
     */
    private Integer endtime;

    /**
     * 可以领奖的时间，过了这个时间，这个榜单会被清理掉
     */
    private Integer rewardEndtime;

    /**
     * 活动说明
     */
    private String desc;

    /**
     * 行列排
     */
    private String title;

    /**
     * 生成排行的SQL语句
     */
    private String sql;

    /**
     * 日排行的SQL语句
     */
    private String daySql;


    @Override
    protected Serializable pkVal() {
        return this.actid;
    }

}
