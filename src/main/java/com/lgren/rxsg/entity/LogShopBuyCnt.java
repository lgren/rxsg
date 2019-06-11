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
public class LogShopBuyCnt extends Model<LogShopBuyCnt> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * cfg_shop的id
     */
    private Integer sid;

    /**
     * 该商品已经购买的次数
     */
    private Integer count;

    /**
     * -1未知0元宝1礼金2五珠钱3铜币
     */
    private Integer paytype;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
