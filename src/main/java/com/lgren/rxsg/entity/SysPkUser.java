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
public class SysPkUser extends Model<SysPkUser> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 普通类型,战役编号*100+当前战役关卡编号，第2战役第5关就是205
     */
    private Integer normal;

    /**
     * 精英类型
     */
    private Integer special;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
