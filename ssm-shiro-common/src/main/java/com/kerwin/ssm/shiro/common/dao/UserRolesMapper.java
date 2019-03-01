package com.kerwin.ssm.shiro.common.dao;

import com.kerwin.ssm.shiro.common.po.UserRoles;
import java.util.List;

public interface UserRolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoles record);

    UserRoles selectByPrimaryKey(Integer id);

    List<UserRoles> selectAll();

    int updateByPrimaryKey(UserRoles record);
}