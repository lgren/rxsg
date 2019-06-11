package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 建造建筑的前提条件
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgBuildingCondition extends Model<CfgBuildingCondition> {

    private static final long serialVersionUID = 1L;

    private Integer bid;

    private Integer levelid;

    /**
     * 0:building; 1:technic;2:goods
     */
    private Integer preType;

    private Integer preId;

    private Integer preLevel;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
