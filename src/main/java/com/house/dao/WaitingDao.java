package com.house.dao;

import com.house.domain.Waiting;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WaitingDao {
    @Select("select * from waiting ORDER BY NO DESC")//查询所有视频
    public List<Waiting> findAll();
}
