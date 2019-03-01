package com.kerwin.ssm.shiro.common.dao;

import com.kerwin.ssm.shiro.common.po.China;
import java.util.List;

public interface ChinaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(China record);

    China selectByPrimaryKey(Integer id);

    List<China> selectAll();

    int updateByPrimaryKey(China record);
}