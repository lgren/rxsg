package com.lgren.rxsg.mapper;

import com.lgren.rxsg.entity.CfgTieAttribute;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgren.rxsg.entity.vo.TieAttrVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
public interface CfgTieAttributeMapper extends BaseMapper<CfgTieAttribute> {

    List<TieAttrVO> tieAttrVOList(Integer tieid);
}
