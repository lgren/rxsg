package com.lgren.rxsg.entity;

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
public class CfgPageTime extends Model<CfgPageTime> {

    private static final long serialVersionUID = 1L;

    private Integer time;

    /**
     * 要发放的天书类型，０表示概率最小的，１表示封皮
     */
    private Integer type;

    /**
     * 表示这个时间点的事件是否已经触发，０表示未触发，１表示触发
     */
    private Integer used;


    @Override
    protected Serializable pkVal() {
        return this.time;
    }

}
