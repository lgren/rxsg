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
public class SysAllowAutoDiscard extends Model<SysAllowAutoDiscard> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private Integer allow;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
