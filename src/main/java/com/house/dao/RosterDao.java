package com.house.dao;

import com.house.domain.Roster;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RosterDao {
    @Select("select * from roster ORDER BY NO DESC")//查询所有视频
    public List<Roster> findAll();
}
