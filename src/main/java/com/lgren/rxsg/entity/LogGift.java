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
public class LogGift extends Model<LogGift> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer count;

    private Integer time;

    /**
     * 0：直充
1：官网兑换
2：新手礼包
3：礼券
4: GM操作
10：购买道具
20：宝箱开出
50：市场向商人买
51: 市场卖给商人
60: 任务奖励
70：墨家立即完成
75：休假消耗元宝
80: 招徕人口消耗
     */
    private Integer type;

    private Integer gid;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
