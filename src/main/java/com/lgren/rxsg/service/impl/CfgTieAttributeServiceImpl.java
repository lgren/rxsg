package com.lgren.rxsg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgren.rxsg.entity.CfgTieAttribute;
import com.lgren.rxsg.entity.vo.TieAttrVO;
import com.lgren.rxsg.mapper.CfgTieAttributeMapper;
import com.lgren.rxsg.service.ICfgTieAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class CfgTieAttributeServiceImpl extends ServiceImpl<CfgTieAttributeMapper, CfgTieAttribute> implements ICfgTieAttributeService {
    @Autowired
    private CfgTieAttributeMapper cfgTieAttributeMapper;

    @Override
    public List<TieAttrVO> tieAttrVOList(Integer tieid) {
        return cfgTieAttributeMapper.tieAttrVOList(tieid);
    }
}
