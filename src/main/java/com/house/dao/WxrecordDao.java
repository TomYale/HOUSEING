package com.house.dao;

import com.house.domain.Tfrecord;
import com.house.domain.Wxrecord;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WxrecordDao {
    @Select("select * from wx_record ORDER BY NO DESC")//查询所有视频
    public List<Wxrecord> findAll();
}
