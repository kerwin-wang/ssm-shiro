/*
 * Copyright: Copyright (c) 2019 All Rights Reserved.
 * Company: kerwin(西安)
 */

package com.kerwin.ssm.shiro.common.service;

import com.kerwin.ssm.shiro.common.po.Roles;
import com.kerwin.ssm.shiro.common.po.User;

import java.util.Set;

/**
 * @ClassName: RolesService
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2019-03-06 17:26
 */
public interface RolesService
{
    Set<Roles> getRolesByUser(User user);
}
