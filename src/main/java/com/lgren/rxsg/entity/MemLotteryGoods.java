package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
public class MemLotteryGoods extends Model<MemLotteryGoods> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 1~8等
type,id,count
     */
    private String records;

    private LocalDate time;

    /**
     * 重开次数
     */
    private Integer restartCount;

    /**
     * 是否领取,0:未领取，1:领取
     */
    private Integer got;

    /**
     * 获奖，格式type,id,count; type=0:物品，1:装备
     */
    private String win;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
