package com.lgren.rxsg.config;

import com.lgren.rxsg.entity.constant.Constant;
import com.lgren.rxsg.service.ICfgAttributeService;
import com.lgren.rxsg.util.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * TODO
 * @author lgren
 * @create 2019-06-13 11:32
 **/
@Component
@Slf4j
@Order(1)
public class DBConstantConfig implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("------------------数据库加载数据开始-------------------");
        ICfgAttributeService cfgAttributeService = SpringUtil.getBean(ICfgAttributeService.class);
        Constant.ARMOR_ATTR_MAP.put(1, cfgAttributeService.getAttrList(1));
        log.info("------------------数据库加载数据完成-------------------");
    }
}
