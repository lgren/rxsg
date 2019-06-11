package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 孩子状态改变记录表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LogChildStatus extends Model<LogChildStatus> {

    private static final long serialVersionUID = 1L;

    /**
     * 孩子hid
     */
    private Integer hid;

    private Integer uid;

    /**
     * 如果该孩子已经转化成将领 则表示将领hid，否则为0
     */
    private Integer outHid;

    /**
     * 0：保存母子培养关系，1：孩子周游列国去了，2：孩子被解雇了，3：逃亡状态，4：保存母子将领状态
     */
    private Integer state;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}
