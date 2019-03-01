package com.kerwin.ssm.shiro.common.dao;

import com.kerwin.ssm.shiro.common.po.Roles;
import java.util.List;

public interface RolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    Roles selectByPrimaryKey(Integer id);

    List<Roles> selectAll();

    int updateByPrimaryKey(Roles record);
}