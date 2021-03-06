package com.kerwin.ssm.shiro.common.dao;

import com.kerwin.ssm.shiro.common.po.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}