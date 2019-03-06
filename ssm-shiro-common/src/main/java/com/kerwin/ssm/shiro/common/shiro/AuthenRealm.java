/*
 * Copyright: Copyright (c) 2019 All Rights Reserved.
 * Company: kerwin(西安)
 */

package com.kerwin.ssm.shiro.common.shiro;

import com.kerwin.ssm.shiro.common.po.Roles;
import com.kerwin.ssm.shiro.common.po.User;
import com.kerwin.ssm.shiro.common.service.RolesService;
import com.kerwin.ssm.shiro.common.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: AuthenRealm
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2019-03-06 16:56
 */
public class AuthenRealm extends AuthorizingRealm
{
    @Autowired
    private UserService userService;

    @Autowired
    private RolesService rolesService;

    /*授权使用*/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection)
    {
        User user = (User) principalCollection.fromRealm(this.getClass().getName()).iterator().next();
        List<String> permisionList = new ArrayList<>();
        Set<Roles> rolesSet = rolesService.getRolesByUser(user);
        if(CollectionUtils.isNotEmpty(rolesSet)){
            for (Roles roles : rolesSet)
            {
                
            }
        }
        return null;
    }

    /*认证使用*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException
    {
        UsernamePasswordToken passwordToken = (UsernamePasswordToken) authenticationToken;
        String username = passwordToken.getUsername();
        User user = userService.getUserByUsername(username);
        return new SimpleAuthenticationInfo(user,user.getUserPassword(),this.getClass().getName());
    }
}
