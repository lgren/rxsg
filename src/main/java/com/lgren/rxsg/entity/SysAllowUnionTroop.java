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
public class SysAllowUnionTroop extends Model<SysAllowUnionTroop> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 是否允许盟友驻军
０：禁止
１：允许
     */
    private Integer allow;

    private Integer antiInvade;

    private Integer antiPlunder;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
