package com.house.dao;

import com.house.domain.Qtrecord;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QtrecordDao {
    @Select("select * from qt_record ORDER BY NO DESC")//查询所有视频
    public List<Qtrecord> findAll();
}
