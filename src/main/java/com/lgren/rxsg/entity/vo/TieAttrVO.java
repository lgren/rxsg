package com.lgren.rxsg.entity.vo;

import com.lgren.rxsg.entity.CfgTieAttribute;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

import java.util.Optional;

/**
 * TODO
 * @author lgren
 * @create 2019-05-24 15:42
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TieAttrVO extends CfgTieAttribute {
    /**
     * 属性名称
     */
    private String attName;

    /**
     * 套装名称
     */
    private String tieName;

    public TieAttrVO() {}

    public TieAttrVO(CfgTieAttribute tieAttr) {
        Optional.ofNullable(tieAttr).ifPresent(r -> BeanUtils.copyProperties(r, this));
    }

}
