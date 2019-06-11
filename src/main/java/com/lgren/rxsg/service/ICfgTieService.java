package com.lgren.rxsg.service;

import com.lgren.rxsg.controller.common.CResult;
import com.lgren.rxsg.entity.CfgTie;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lgren.rxsg.entity.dto.TieDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
public interface ICfgTieService extends IService<CfgTie> {

    CResult<String> saveOrEditAll(TieDTO tieDTO);

    CResult<Boolean> deleteTie(Integer id);
}
