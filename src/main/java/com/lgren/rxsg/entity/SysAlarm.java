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
public class SysAlarm extends Model<SysAlarm> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer troops;

    private Integer enemy;

    private Integer report;

    private Integer mail;

    private Integer friend;

    private Integer task;

    private Integer union;

    private Integer battle;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
