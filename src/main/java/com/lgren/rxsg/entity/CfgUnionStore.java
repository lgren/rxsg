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
public class CfgUnionStore extends Model<CfgUnionStore> {

    private static final long serialVersionUID = 1L;

    private Integer gid;

    private String name;

    private Integer level;

    private String intro;

    @TableField("needInfo")
    private String needInfo;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
