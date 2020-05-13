package com.house.dao;

import com.house.domain.Lottery;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LotteryDao {
    @Select("select * from lottery ORDER BY NO DESC")//查询所有视频
    public List<Lottery> findAll();
}
