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
public class CfgPkHero extends Model<CfgPkHero> {

    private static final long serialVersionUID = 1L;

    private Integer hid;

    private Integer battleid;

    /**
     * 将领名称
     */
    private String name;

    /**
     * 0,非显示将;1,显示将
     */
    private Integer flag;

    private Integer sex;

    private Integer face;

    private Integer energy;

    private Integer commandBase;

    private Integer affairBase;

    private Integer braveryBase;

    private Integer wisdomBase;

    private Integer speedBase;

    private Integer energyAdd;

    private Integer commandAdd;

    private Integer affairAdd;

    private Integer braveryAdd;

    private Integer wisdomAdd;

    private Integer speedAdd;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}
