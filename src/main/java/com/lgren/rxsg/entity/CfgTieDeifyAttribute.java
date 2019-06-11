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
public class CfgTieDeifyAttribute extends Model<CfgTieDeifyAttribute> {

    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    private Integer attid;

    /**
     * 套装id
     */
    private Integer tieid;

    /**
     * 属性下限
     */
    private Integer low;

    /**
     * 属性上限
     */
    private Integer high;


    @Override
    protected Serializable pkVal() {
        return this.attid;
    }

}
