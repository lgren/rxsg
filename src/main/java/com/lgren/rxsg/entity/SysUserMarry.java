package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 玩家亲子系统相关的数据表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserMarry extends Model<SysUserMarry> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 玩家拥有房间的数量
     */
    private Integer roomcount;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
