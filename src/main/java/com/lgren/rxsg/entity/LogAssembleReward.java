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
public class LogAssembleReward extends Model<LogAssembleReward> {

    private static final long serialVersionUID = 1L;

    private Integer rank;

    private Integer uid;

    private String name;

    /**
     * 0：未领取，1已领取
     */
    private Integer reward;

    /**
     * 领取奖励的时间
     */
    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}
