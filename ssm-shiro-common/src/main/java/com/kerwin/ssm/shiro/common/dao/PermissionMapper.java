package com.kerwin.ssm.shiro.common.dao;

import com.kerwin.ssm.shiro.common.po.Permission;
import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    Permission selectByPrimaryKey(Integer id);

    List<Permission> selectAll();

    int updateByPrimaryKey(Permission record);
}