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
public class SysUserState extends Model<SysUserState> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 封禁开始时间
     */
    private Integer forbistart;

    /**
     * 封禁结束时间
     */
    private Integer forbiend;

    /**
     * 休假开始时间
     */
    private Integer vacstart;

    /**
     * 休闲结束时间
     */
    private Integer vacend;

    private String reason;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
