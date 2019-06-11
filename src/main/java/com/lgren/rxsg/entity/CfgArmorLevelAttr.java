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
public class CfgArmorLevelAttr extends Model<CfgArmorLevelAttr> {

    private static final long serialVersionUID = 1L;

    private Integer level;

    /**
     * ARMATT_COMMAND=1,
ARMATT_AFFAIRS=2,
ARMATT_BRAVERY=3,
ARMATT_WISDOM=4,
ARMATT_FORCE=5,
ARMATT_ENERGY=6,
ARMATT_HP=7,
ARMATT_AP=8,
ARMATT_DP=9,
ARMATT_RANGE=10,
ARMATT_SPEED=11,
ARMATT_CARRY=12,
     */
    private String attr;


    @Override
    protected Serializable pkVal() {
        return this.level;
    }

}
