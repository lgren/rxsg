package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户点击操作累计数据记录
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LogActionCount extends Model<LogActionCount> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 用户累计点击操作id
     */
    private Integer aid;

    /**
     * 用户点击操作累计次数
     */
    private Integer count;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
