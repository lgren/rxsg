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
public class CfgWall extends Model<CfgWall> {

    private static final long serialVersionUID = 1L;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 耐久度
     */
    private Integer life;

    /**
     * 射程加成百分比
     */
    private Integer rangeAdd;

    /**
     * 容量
     */
    private Integer area;

    private Integer dp;

    private Integer dpAdd;


    @Override
    protected Serializable pkVal() {
        return this.level;
    }

}
