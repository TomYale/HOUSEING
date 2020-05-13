package com.house.dao;

import com.house.domain.Tfrecord;
import com.house.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user ORDER BY NO DESC")//查询所有用户
    public List<User> findAll();
}
