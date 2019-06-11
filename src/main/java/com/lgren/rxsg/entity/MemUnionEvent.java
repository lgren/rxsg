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
public class MemUnionEvent extends Model<MemUnionEvent> {

    private static final long serialVersionUID = 1L;

    private Integer unionid;

    /**
     * 事件类型
     */
    private Integer type;

    /**
     * 事件内容
     */
    private String content;

    /**
     * 事件发生时间
     */
    private Integer evttime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
