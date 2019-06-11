package com.lgren.rxsg.service.impl;

import com.lgren.rxsg.entity.LogUserAction;
import com.lgren.rxsg.mapper.LogUserActionMapper;
import com.lgren.rxsg.service.ILogUserActionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户点击操作日志记录 服务实现类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Service
public class LogUserActionServiceImpl extends ServiceImpl<LogUserActionMapper, LogUserAction> implements ILogUserActionService {

}
