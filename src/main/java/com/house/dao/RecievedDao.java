package com.house.dao;

import com.house.domain.Recieved;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RecievedDao {
    @Select("select * from recieved ORDER BY NO DESC")//查询所有视频
    public List<Recieved> findAll();
}
