package com.kerwin.ssm.shiro.common.service;

import com.kerwin.ssm.shiro.common.po.Roles;
import com.kerwin.ssm.shiro.common.po.User;

/**
 * @ClassName: UserService
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2019-02-28 13:04
 */
public interface UserService
{

    User getAllUser();

    User getUserByUsername(String username);


}
