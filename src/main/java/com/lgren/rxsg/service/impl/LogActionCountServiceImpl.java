package com.lgren.rxsg.service.impl;

import com.lgren.rxsg.entity.LogActionCount;
import com.lgren.rxsg.mapper.LogActionCountMapper;
import com.lgren.rxsg.service.ILogActionCountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户点击操作累计数据记录 服务实现类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Service
public class LogActionCountServiceImpl extends ServiceImpl<LogActionCountMapper, LogActionCount> implements ILogActionCountService {

}
