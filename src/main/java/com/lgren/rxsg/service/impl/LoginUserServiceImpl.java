package com.lgren.rxsg.service.impl;

import com.lgren.rxsg.entity.LoginUser;
import com.lgren.rxsg.mapper.LoginUserMapper;
import com.lgren.rxsg.service.ILoginUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Service
public class LoginUserServiceImpl extends ServiceImpl<LoginUserMapper, LoginUser> implements ILoginUserService {

}
