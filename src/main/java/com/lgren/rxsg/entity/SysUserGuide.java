package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 引导完成状态

 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserGuide extends Model<SysUserGuide> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer gid;

    /**
     * 完成状态
0：未完成 1：已完成
     */
    private Integer state;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
