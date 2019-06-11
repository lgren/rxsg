package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 夫人怀孕期间数据表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MemMarryDuring extends Model<MemMarryDuring> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    /**
     * 夫人hid
     */
    private Integer hid;

    /**
     * 怀孕开始的时间
     */
    private Integer starttime;

    /**
     * 怀孕结束的时间
     */
    private Integer endtime;

    /**
     * 怀孕期间是否加速过，0：没有加速，1：加速过
     */
    @TableField("isSpeed")
    private Integer isSpeed;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
