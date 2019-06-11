package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 任务完成次数log
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LogTask extends Model<LogTask> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 任务tid
     */
    private Integer tid;

    private Integer count;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}