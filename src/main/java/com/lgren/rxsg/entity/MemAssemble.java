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
public class MemAssemble extends Model<MemAssemble> {

    private static final long serialVersionUID = 1L;

    private Integer rank;

    private Integer uid;

    /**
     * 奖励物品id
     */
    private Integer rewardid;

    /**
     * 奖励数量
     */
    private Integer count;

    private Integer level;

    /**
     * 领取奖励的时间
     */
    private Integer endtime;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
