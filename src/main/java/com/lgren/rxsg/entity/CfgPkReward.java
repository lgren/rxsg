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
public class CfgPkReward extends Model<CfgPkReward> {

    private static final long serialVersionUID = 1L;

    private Integer battleid;

    /**
     * 0,普通;1,精英
     */
    private Integer type;

    /**
     * 0,good;1,armor
     */
    private Integer rewardtype;

    /**
     * 对应的物品id
     */
    private Integer rewardid;

    private Integer count;


    @Override
    protected Serializable pkVal() {
        return this.battleid;
    }

}
