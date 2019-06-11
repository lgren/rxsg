package com.lgren.rxsg.service.impl;

import com.lgren.rxsg.entity.LogTask;
import com.lgren.rxsg.mapper.LogTaskMapper;
import com.lgren.rxsg.service.ILogTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务完成次数log 服务实现类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Service
public class LogTaskServiceImpl extends ServiceImpl<LogTaskMapper, LogTask> implements ILogTaskService {

}
