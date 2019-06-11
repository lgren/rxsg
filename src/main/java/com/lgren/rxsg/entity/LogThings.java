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
public class LogThings extends Model<LogThings> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer tid;

    private Integer count;

    private Integer time;

    /**
     * 0:玩家使用
1:野地刷出
2:商场购买
3:宝箱刷出
4:任务奖励
5:GM操作
6:礼包赠送
7:赏赐
8:礼券兑换
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
