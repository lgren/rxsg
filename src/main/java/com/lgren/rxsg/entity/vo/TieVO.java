package com.lgren.rxsg.entity.vo;

import com.lgren.rxsg.entity.CfgTie;
import com.lgren.rxsg.entity.CfgTieAttribute;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Optional;

/**
 * TODO
 * @author lgren
 * @create 2019-05-24 15:42
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TieVO extends CfgTie {

    private List<TieAttrVO> tieAttrList;

    public TieVO() {}

    public TieVO(CfgTie tie) {
        Optional.ofNullable(tie).ifPresent(r -> BeanUtils.copyProperties(r, this));
    }

}
