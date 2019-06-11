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
public class CfgActShopgift extends Model<CfgActShopgift> {

    private static final long serialVersionUID = 1L;

    private Integer actid;

    /**
     * 最少消费money_limit个元宝才可以赠送
     */
    private Integer moneyLimit;

    /**
     * 元宝上限
2000000000：表示不限
     */
    private Integer maxMoneyLimit;


    @Override
    protected Serializable pkVal() {
        return this.actid;
    }

}
