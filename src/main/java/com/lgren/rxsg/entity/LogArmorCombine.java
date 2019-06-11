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
public class LogArmorCombine extends Model<LogArmorCombine> {

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

    private Integer usegoods;

    private Integer success;

    private Integer mainsid;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.sid;
    }

}
