package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class CfgTie extends Model<CfgTie> {

    private static final long serialVersionUID = 1L;

    /**
     * 套装id
     */
    @TableId(type = IdType.NONE)
    private Integer tieid;

    /**
     * 套装件数
     */
    private Integer count;

    /**
     * 套装名称
     */
    private String name;


    @Override
    protected Serializable pkVal() {
        return this.tieid;
    }

}
