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
public class SysUserArmor extends Model<SysUserArmor> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    private Integer uid;

    /**
     * 装备ID
     */
    private Integer armorid;

    /**
     * 装备耐久度
     */
    private Integer hp;

    /**
     * 备装当前最大耐久度
     */
    private Integer hpMax;

    /**
     * 目前在使用该装备的将领，０表示装备无人使用
     */
    private Integer hid;

    private Integer strongLevel;

    private Integer strongValue;

    private String embedPearls;

    /**
     * 0:打开, 1:需要一级打孔器, 2:需要2级打孔器 3:不开的
     */
    private String embedHoles;

    private String deified;

    private Integer activeSpecial;

    private Integer strongTimes;

    private Integer combineLevel;

    /**
     * 装备拥有的极品属性a,b,c   a参照cfg_xilian id，b是属性，c是增加值
     */
    private String bestQuality;


    @Override
    protected Serializable pkVal() {
        return this.sid;
    }

}
