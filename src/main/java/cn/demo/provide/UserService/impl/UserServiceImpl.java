package cn.demo.provide.UserService.impl;

import cn.demo.provide.UserService.IUserService;
import com.alibaba.dubbo.config.annotation.Service;


@Service
//dubbo调用注解
public class UserServiceImpl implements IUserService {

    @Override
    public String getName() {
        return "调用成功";
    }
}
