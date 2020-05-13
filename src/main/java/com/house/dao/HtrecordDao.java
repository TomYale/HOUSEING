package com.house.dao;

import com.house.domain.Htrecord;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HtrecordDao {
    @Select("select * from ht_record ORDER BY NO DESC")//查询所有视频
    public List<Htrecord> findAll();
}
