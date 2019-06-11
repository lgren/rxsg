package com.lgren.rxsg.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lgren.rxsg.entity.CfgAttribute;
import com.lgren.rxsg.mapper.CfgAttributeMapper;
import com.lgren.rxsg.service.ICfgAttributeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Service
public class CfgAttributeServiceImpl extends ServiceImpl<CfgAttributeMapper, CfgAttribute> implements ICfgAttributeService {

    @Override
    // @Cacheable("attrList")
    public List<CfgAttribute> getAttrList(Integer type) {
        List<CfgAttribute> attrList;
        switch (type) {
            // type 1-12
            case 1:
                attrList = super.list(new QueryWrapper<CfgAttribute>()
                        .lambda().lt(CfgAttribute::getType, 13).gt(CfgAttribute::getType, 0));
                break;
            default:
                attrList = list(null);
        }
        return attrList;
    }
}
