package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Size;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(of = {"tieid", "precond"},callSuper = false)
@Accessors(chain = true)
public class CfgTieAttribute extends Model<CfgTieAttribute> {

    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    private Integer attid;

    /**
     * 套装id
     */
    @TableId
    private Integer tieid;

    /**
     * 属性值
     */
    private Integer value;

    /**
     * 激活此属性需要的装备件数
     */
    @TableId
    private Integer precond;

    @Override
    protected Serializable pkVal() {
        return this.attid;
    }

}
