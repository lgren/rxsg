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
public class CfgAttribute extends Model<CfgAttribute> {

    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    private Integer attid;

    /**
     * 属性类型
     */
    private Integer type;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性大概描述
     */
    private String summary;

    /**
     * 属性详细描述
     */
    private String detail;

    /**
     * 最低可能出现的属性值
     */
    private Integer low;

    /**
     * 最高可能出现的属性值
     */
    private Integer high;


    @Override
    protected Serializable pkVal() {
        return this.attid;
    }

}
