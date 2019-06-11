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
public class SysUserTactics extends Model<SysUserTactics> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private String plunder;

    private String invade;

    private String field;

    private String patrol;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
