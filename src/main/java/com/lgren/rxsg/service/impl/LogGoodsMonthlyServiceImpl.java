package com.lgren.rxsg.service.impl;

import com.lgren.rxsg.entity.LogGoodsMonthly;
import com.lgren.rxsg.mapper.LogGoodsMonthlyMapper;
import com.lgren.rxsg.service.ILogGoodsMonthlyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 根据uid,gid进行每月统计 服务实现类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Service
public class LogGoodsMonthlyServiceImpl extends ServiceImpl<LogGoodsMonthlyMapper, LogGoodsMonthly> implements ILogGoodsMonthlyService {

}
