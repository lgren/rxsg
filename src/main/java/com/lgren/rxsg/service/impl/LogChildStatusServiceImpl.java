package com.lgren.rxsg.service.impl;

import com.lgren.rxsg.entity.LogChildStatus;
import com.lgren.rxsg.mapper.LogChildStatusMapper;
import com.lgren.rxsg.service.ILogChildStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 孩子状态改变记录表 服务实现类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Service
public class LogChildStatusServiceImpl extends ServiceImpl<LogChildStatusMapper, LogChildStatus> implements ILogChildStatusService {

}
