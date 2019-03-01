package com.kerwin.ssm.shiro.common.dao;

import com.kerwin.ssm.shiro.common.po.Users;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("userId") String userId);

    int insert(Users record);

    Users selectByPrimaryKey(@Param("id") Integer id, @Param("userId") String userId);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}