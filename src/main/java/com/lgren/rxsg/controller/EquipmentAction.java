package com.lgren.rxsg.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lgren.rxsg.controller.common.CResult;
import com.lgren.rxsg.entity.CfgArmor;
import com.lgren.rxsg.entity.CfgTie;
import com.lgren.rxsg.entity.dto.CfgArmorDTO;
import com.lgren.rxsg.entity.dto.CommonDTO;
import com.lgren.rxsg.entity.dto.TieDTO;
import com.lgren.rxsg.entity.vo.TieAttrVO;
import com.lgren.rxsg.service.*;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

/**
 * 装备管理
 * @author lgren
 * @create 2019-05-24 11:39
 **/
@Controller
@RequestMapping("/equipment")
@Slf4j
public class EquipmentAction {
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
    @GetMapping("toEquipment")
    public String toEquipment(Map<String, Object> map) {
        List<CfgTie> tieList = cfgTieService.list(new QueryWrapper<CfgTie>()
                .orderByDesc("tieid"));// 所有套装
        map.put("tieList", tieList);
        map.put("attrList", cfgAttributeService.getAttrList(1));
        return "equipment/equipment_div";
    }

    @ApiOperation(value="分页查询装备")
    @GetMapping("armor")
    @ResponseBody
    public CResult<IPage<CfgArmor>> getArmor(CfgArmorDTO cfgArmor, CommonDTO dto) {
        IPage<CfgArmor> page = new Page<>(dto.getCurrent(), dto.getSize());
        LambdaQueryWrapper<CfgArmor> wrapper = new QueryWrapper<CfgArmor>().lambda();
        //region 筛选条件
        // 装备ID
        ofNullable(cfgArmor.getId())
                .ifPresent(o -> wrapper.eq(CfgArmor::getId, o));
        // 装备名
        ofNullable(cfgArmor.getName()).filter(StringUtils::isNotBlank)
                .ifPresent(o -> wrapper.like(CfgArmor::getName, o));
        // 装备部位
        ofNullable(cfgArmor.getParts()).filter(StringUtils::isNotBlank)
                .ifPresent(o -> wrapper.in(CfgArmor::getPart, cfgArmor.getPartArr()));
        // 装备类型(橙色/蓝色等)
        ofNullable(cfgArmor.getTypes()).filter(StringUtils::isNotBlank)
                .ifPresent(o -> wrapper.eq(CfgArmor::getType, cfgArmor.getTypeArr()));
        //endregion
        return CResult.newSuccess(cfgArmorService.page(page, wrapper));
    }

    @ApiOperation(value="根据套装ID查询装备")
    @GetMapping("getArmorByTieid")
    @ResponseBody
    public CResult<List<CfgArmor>> getArmorByTieid(Integer tieid) {
        return CResult.newSuccess(cfgArmorService.list(new QueryWrapper<CfgArmor>().lambda()
                .eq(CfgArmor::getTieid, tieid)));
    }
    //endregion


    //region -------------------------------------套装-------------------------------------

    @ApiOperation(value="套装主界面")
    @GetMapping("toTie")
    public String toTie(Map<String, Object> map) {
        List<CfgTie> tieList = cfgTieService.list(new QueryWrapper<CfgTie>()
                .orderByDesc("tieid"));// 所有套装
        map.put("tieList", tieList);
        map.put("attrList", cfgAttributeService.getAttrList(1));
        return "equipment/tie_div";
    }

    @ApiOperation(value="查看套装详细信息")
    @GetMapping("tie")
    @ResponseBody
    public CResult<List<TieAttrVO>> tieInfo(Integer tieid) {
        return CResult.newSuccess(cfgTieAttributeService.tieAttrVOList(tieid));
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
    @DeleteMapping("tie/{id}")
    @ResponseBody
    public CResult<Boolean> tieDelete(@PathVariable("id") Integer id) {
        return cfgTieService.deleteTie(id);
    }
    //endregion


}
