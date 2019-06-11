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
public class PayLog extends Model<PayLog> {

    private static final long serialVersionUID = 1L;

    private String orderid;

    private Integer type;

    private String payname;

    private String passport;

    private String passtype;

    private Integer money;

    private String code;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.orderid;
    }

}
