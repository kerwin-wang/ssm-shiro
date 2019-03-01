package com.kerwin.ssm.shiro.common.dao;

import com.kerwin.ssm.shiro.common.po.RolesPermission;
import java.util.List;

public interface RolesPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolesPermission record);

    RolesPermission selectByPrimaryKey(Integer id);

    List<RolesPermission> selectAll();

    int updateByPrimaryKey(RolesPermission record);
}