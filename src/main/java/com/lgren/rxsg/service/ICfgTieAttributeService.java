package com.lgren.rxsg.service;

import com.lgren.rxsg.entity.CfgTieAttribute;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lgren.rxsg.entity.vo.TieAttrVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
public interface ICfgTieAttributeService extends IService<CfgTieAttribute> {

    List<TieAttrVO> tieAttrVOList(Integer tieid);
}
