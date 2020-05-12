package com.house.dao;


import com.house.domain.Tfrecord;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TfrecordDao {
    @Select("select * from tf_record")//查询所有视频
    public List<Tfrecord> findAll();

}