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
public class SysArmorSpecial extends Model<SysArmorSpecial> {

    private static final long serialVersionUID = 1L;

    private Integer sid;

    /**
     * 0:没有特效;1:加属性;2:重伤;3:降级建筑;4:将领速度;5:战场距离
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.sid;
    }

}
