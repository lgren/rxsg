package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class CfgDesignation extends Model<CfgDesignation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "did", type = IdType.AUTO)
    private Integer did;

    private String name;

    private String description;

    private String condition;

    /**
     * 0：非永久，1：永久
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.did;
    }

}
