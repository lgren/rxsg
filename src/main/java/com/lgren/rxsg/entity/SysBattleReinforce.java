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
public class SysBattleReinforce extends Model<SysBattleReinforce> {

    private static final long serialVersionUID = 1L;

    private Integer troopid;

    private Integer sid;

    private Integer count;

    /**
     * 0 通过援军令召唤 1 通过战场事件奖励军队
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.troopid;
    }

}
