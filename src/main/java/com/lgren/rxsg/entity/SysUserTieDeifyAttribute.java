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
public class SysUserTieDeifyAttribute extends Model<SysUserTieDeifyAttribute> {

    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    private Integer attid;

    /**
     * 装备id
     */
    private Integer sid;

    /**
     * 属性值
     */
    private Integer value;


    @Override
    protected Serializable pkVal() {
        return this.attid;
    }

}
