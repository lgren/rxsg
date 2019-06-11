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
public class SysHeroAttribute extends Model<SysHeroAttribute> {

    private static final long serialVersionUID = 1L;

    /**
     * 将领ID
     */
    private Integer hid;

    /**
     * 属性id
     */
    private Integer attid;

    /**
     * 属性值
     */
    private Integer value;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}
