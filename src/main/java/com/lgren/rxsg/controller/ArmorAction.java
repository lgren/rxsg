package com.lgren.rxsg.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgren.rxsg.controller.common.CResult;
import com.lgren.rxsg.entity.CfgArmor;
import com.lgren.rxsg.entity.CfgTie;
import com.lgren.rxsg.entity.constant.Constant;
import com.lgren.rxsg.entity.dto.CfgArmorDTO;
import com.lgren.rxsg.entity.dto.CommonDTO;
import com.lgren.rxsg.entity.dto.TieDTO;
import com.lgren.rxsg.entity.vo.TieVO;
import com.lgren.rxsg.service.*;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.lgren.rxsg.util.LgrenUtil.notBlank;

/**
 * 装备管理
 * @author lgren
 * @create 2019-05-24 11:39
 **/
@Controller
@RequestMapping("/armor")
@Slf4j
public class ArmorAction {
    //region 装备
    @Autowired
    private ICfgArmorService cfgArmorService;
    @Autowired
    private ICfgArmorLevelAttrService cfgArmorLevelAttrService;
    @Autowired
    private ISysUserArmorService sysUserArmorService;
    @Autowired
    private ISysHeroArmorService sysHeroArmorService;
    //endregion
    //region 套装
    @Autowired
    private ICfgTieService cfgTieService;
    @Autowired
    private ICfgTieAttributeService cfgTieAttributeService;
    //endregion
    @Autowired
    private ICfgAttributeService cfgAttributeService;// 属性值


    //region -------------------------------------装备-------------------------------------

    @ApiOperation(value="装备主界面")
    @GetMapping("toArmor")
    public String toArmor(Map<String, Object> map) {
        List<CfgTie> tieList = cfgTieService.list(new QueryWrapper<CfgTie>()
                .orderByDesc("tieid"));// 所有套装
        map.put("tieList", tieList);
        map.put("attrList", cfgAttributeService.getAttrList(1));
        return "armor/armor_div";
    }

    @ApiOperation(value="分页查询装备")
    @GetMapping("armor")
    @ResponseBody
    public CResult<IPage<CfgArmor>> getArmor(CommonDTO dto, CfgArmorDTO cfgArmor) {
        IPage<CfgArmor> page = new Page<>(dto.getCurrent(), dto.getPageSize());
        LambdaQueryWrapper<CfgArmor> wrapper = new QueryWrapper<CfgArmor>().lambda();
        //region 筛选条件
        // 装备ID
        notBlank(cfgArmor.getId()).ifPresent(o -> wrapper.eq(CfgArmor::getId, o));
        // 套装ID
        notBlank(cfgArmor.getTieid()).ifPresent(o -> wrapper.eq(CfgArmor::getTieid, o));
        // 装备名
        notBlank(cfgArmor.getName()).ifPresent(o -> wrapper.like(CfgArmor::getName, o));
        // 装备部位
        notBlank(cfgArmor.getParts()).ifPresent(o -> wrapper.in(CfgArmor::getPart, cfgArmor.getPartArr()));
        // 装备类型(橙色/蓝色等)
        notBlank(cfgArmor.getTypes()).ifPresent(o -> wrapper.in(CfgArmor::getType, cfgArmor.getTypeArr()));
        //endregion
        return CResult.newSuccess(cfgArmorService.page(page, wrapper));
    }
    //endregion


    //region -------------------------------------套装-------------------------------------

    @ApiOperation(value="套装主界面")
    @GetMapping("toTie")
    public String toTie(Map<String, Object> map) {
        List<CfgTie> tieList = cfgTieService.list(new QueryWrapper<CfgTie>()
                .orderByDesc("tieid"));// 所有套装
        map.put("tieList", tieList);
        map.put("attrList", Constant.ARMOR_ATTR_MAP.get(1));
        map.put("partMapStr", JSON.toJSONString(Constant.PART_MAP));
        return "Armor/tie_div";
    }

    @ApiOperation(value="查看套装详细信息")
    @GetMapping("tie/{tieid}")
    @ResponseBody
    public CResult<TieVO> tieInfo(@PathVariable("tieid") Integer tieid) {
        return CResult.newSuccess(cfgTieService.getTieVO(tieid));
    }

    @ApiOperation(value="新增/修改套装")
    @PostMapping("tie")
    @ResponseBody
    public CResult<String> tieEdit(@RequestBody @Validated TieDTO tieDTO, BindingResult result) {
        if (result.hasErrors()) {
            String errorMsg = result.getAllErrors().stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .collect(Collectors.joining("<br/>"));
            return CResult.newFailure("-1", errorMsg);
        } else {
            return cfgTieService.saveOrEditAll(tieDTO);
        }
    }

    @ApiOperation(value="删除套装")
    @DeleteMapping("tie/{tieid}")
    @ResponseBody
    public CResult<Boolean> tieDelete(@PathVariable("tieid") Integer tieid) {
        return cfgTieService.deleteTie(tieid);
    }
    //endregion


}
