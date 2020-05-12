package com.house.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VedioDao {
    @Select("select * from vedio")//查询所有视频
    public List<Vedio> findAll();

    @Select("SELECT COUNT(vedioID) FROM vedio")//统计视频数目
    public int getcountAll();
}
