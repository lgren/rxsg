package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 充值送礼活动
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgActPaygift extends Model<CfgActPaygift> {

    private static final long serialVersionUID = 1L;

    private Integer actid;

    /**
     * 最少充值money_limit个元宝才可以赠送
     */
    private Integer moneyLimit;

    /**
     * 最少充值money_limit个元宝才可以赠送
     */
    private Integer daycnt;

    /**
     * 信件标题
     */
    private String mailtitle;

    /**
     * 信件内容
     */
    private String mailcontent;

    /**
     * 元宝上限
0:表示无上限，多充多得
2000000000：表示最大值
     */
    private Integer maxMoneyLimit;


    @Override
    protected Serializable pkVal() {
        return this.actid;
    }

}
