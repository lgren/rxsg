package com.lgren.rxsg.entity.dto;

import com.lgren.rxsg.entity.CfgArmor;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author lgren
 * @create 2019-05-25 14:11
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgArmorDTO extends CfgArmor {
    private String parts;
    private String types;

    public Object[] getPartArr() {
        return parts.split(",");
    }

    public Object[] getTypeArr() {
        return types.split(",");
    }
}
