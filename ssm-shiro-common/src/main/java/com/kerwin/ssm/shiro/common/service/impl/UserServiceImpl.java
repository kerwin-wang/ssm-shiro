package com.kerwin.ssm.shiro.common.service.impl;

import com.kerwin.ssm.shiro.common.po.User;
import com.kerwin.ssm.shiro.common.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2019-02-28 13:07
 */
@Service
public class UserServiceImpl implements UserService
{
    @Override
    public User getAllUser()
    {
        User user = new User();
        user.setId(1);
        user.setUserName("zhangsan");
        user.setUserPassword("123qwe");

        return user;
    }
}
