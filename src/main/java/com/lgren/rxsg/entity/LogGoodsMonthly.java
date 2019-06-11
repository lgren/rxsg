package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 根据uid,gid进行每月统计
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LogGoodsMonthly extends Model<LogGoodsMonthly> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer gid;

    private Integer count;

    /**
     * 月份,200902
     */
    private Integer month;

    /**
     * 0:玩家使用\r\n1:野地刷出\r\n2:商场购买\r\n3:宝箱刷出\r\n4:任务奖励\r\n5:GM操作\r\n6:礼包赠送\r\n7:赏赐\r\n8:礼券兑换
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
