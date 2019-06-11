package com.lgren.rxsg.service;

import com.lgren.rxsg.entity.CfgAttribute;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
public interface ICfgAttributeService extends IService<CfgAttribute> {

    List<CfgAttribute> getAttrList(Integer type);
}
