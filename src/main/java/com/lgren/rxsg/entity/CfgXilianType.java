package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class CfgXilianType extends Model<CfgXilianType> {

    private static final long serialVersionUID = 1L;

    private Integer type;

    @TableField("minAdd")
    private Integer minAdd;

    @TableField("maxAdd")
    private Integer maxAdd;


    @Override
    protected Serializable pkVal() {
        return this.type;
    }

}
