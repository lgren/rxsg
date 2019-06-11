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
public class TempActEvent extends Model<TempActEvent> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 活动事件类型 1001是临时事件
     */
    private Integer type;

    /**
     * 活动事件ID 1002是杀死张角
     */
    private Integer eid;

    private Integer count;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
