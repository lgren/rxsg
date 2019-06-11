package com.lgren.rxsg.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.lgren.rxsg.controller.common.CResult;
import com.lgren.rxsg.entity.CfgTie;
import com.lgren.rxsg.entity.CfgTieAttribute;
import com.lgren.rxsg.entity.dto.TieDTO;
import com.lgren.rxsg.mapper.CfgTieMapper;
import com.lgren.rxsg.service.ICfgTieAttributeService;
import com.lgren.rxsg.service.ICfgTieService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.Size;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 * @author Lgren
 * @since 2019-05-24
 */
@Service
public class CfgTieServiceImpl extends ServiceImpl<CfgTieMapper, CfgTie> implements ICfgTieService {
    @Autowired
    private ICfgTieAttributeService cfgTieAttributeService;
    @Autowired
    private CfgTieMapper cfgTieMapper;

    @Override
    public CResult<String> saveOrEditAll(TieDTO tieDTO) {
        if (tieDTO == null || tieDTO.getCount() == null
                || StringUtils.isBlank(tieDTO.getName())
                || CollectionUtils.isEmpty(tieDTO.getTieAttrList())) {
            return CResult.newFailure("-1", "参数错误");
        }
        List<CfgTieAttribute> tieAttrNewList = tieDTO.getTieAttrList();
        //region 保存/修改tie(套装基础设置)
        if (tieDTO.getTieid() == null) {
            Integer newId = cfgTieMapper.getNewId();
            tieDTO.setTieid(newId);
            super.save(tieDTO);
            tieAttrNewList.forEach(ta -> {
                ta.setTieid(newId);
                cfgTieAttributeService.save(ta);
            });
        } else {
            super.updateById(tieDTO);
            List<CfgTieAttribute> tieAttrOldList = cfgTieAttributeService.list(new QueryWrapper<CfgTieAttribute>().lambda()
                    .eq(CfgTieAttribute::getTieid, tieDTO.getTieid()));
            //region 详细属性变更
            tieAttrNewList.forEach(o -> {
                if (tieAttrOldList.contains(o)) {
                    // 修改
                    cfgTieAttributeService.update(o, new UpdateWrapper<CfgTieAttribute>().lambda()
                                    .eq(CfgTieAttribute::getTieid, o.getTieid())
                                    .eq(CfgTieAttribute::getPrecond, o.getPrecond()));
                    tieAttrOldList.remove(o);
                } else {
                    o.setTieid(tieDTO.getTieid());
                    // 新增
                    cfgTieAttributeService.save(o);
                }
            });
            tieAttrOldList.forEach(o -> {
                // 删除
                cfgTieAttributeService.remove(new QueryWrapper<CfgTieAttribute>().lambda()
                        .eq(CfgTieAttribute::getTieid, o.getTieid())
                        .eq(CfgTieAttribute::getPrecond, o.getPrecond()));
            });
            //endregion
        }
        //endregion

        return CResult.newSuccess("操作成功~");
    }

    @Override
    public CResult<Boolean> deleteTie(Integer id) {
        super.removeById(id);
        cfgTieAttributeService.remove(new QueryWrapper<CfgTieAttribute>().lambda()
                .eq(CfgTieAttribute::getTieid, id));
        // super.removeById(id);
        return CResult.newSuccess(true);
    }
}
