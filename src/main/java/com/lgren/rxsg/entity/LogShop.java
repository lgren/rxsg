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
public class LogShop extends Model<LogShop> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer shopid;

    private Integer count;

    private Integer price;

    private Integer time;

    /**
     * -1未知0元宝1礼金
     */
    private Integer paytype;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
