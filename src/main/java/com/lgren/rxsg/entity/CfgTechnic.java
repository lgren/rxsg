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
 * 科技设定表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgTechnic extends Model<CfgTechnic> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tid", type = IdType.AUTO)
    private Integer tid;

    private String name;

    private String description;


    @Override
    protected Serializable pkVal() {
        return this.tid;
    }

}
