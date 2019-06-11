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
public class SysUserBookshelfnum extends Model<SysUserBookshelfnum> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer uid;

    /**
     * 玩家拥有技能书格子的数量
     */
    private Integer num;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
