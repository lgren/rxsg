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
public class LogSoldierConvert extends Model<LogSoldierConvert> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer cid;

    @TableField("fromSid")
    private Integer fromSid;

    @TableField("fromCount")
    private Integer fromCount;

    @TableField("toSid")
    private Integer toSid;

    @TableField("toCount")
    private Integer toCount;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
