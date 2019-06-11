package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 引导类别
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgGuideGroup extends Model<CfgGuideGroup> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String description;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
