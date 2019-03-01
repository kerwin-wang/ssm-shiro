package com.kerwin.ssm.shiro.common.cotroller;

import com.kerwin.ssm.shiro.common.po.User;
import com.kerwin.ssm.shiro.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserCotroller
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2019-02-28 13:00
 */
@RestController
@RequestMapping(value = "/login")
public class UserCotroller
{
    @Autowired
    UserService userService;

    public User getAllUser(){
        User user = userService.getAllUser();
        return user;
    }
}
