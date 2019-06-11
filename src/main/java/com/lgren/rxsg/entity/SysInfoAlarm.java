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
public class SysInfoAlarm extends Model<SysInfoAlarm> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 信息显示样式，0: 成功提示那种样式
     */
    private Integer type;

    /**
     * uid
     */
    private Integer uid;

    /**
     * 信息
     */
    private String info;

    /**
     * 插入时间
     */
    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
