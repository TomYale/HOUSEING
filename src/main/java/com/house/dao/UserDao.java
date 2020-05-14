package com.house.dao;

import com.house.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user ORDER BY NO DESC")//查询所有用户
    public List<User> findAll();

    @Insert("INSERT INTO `housingmanager`.`user` (`username`, `password`, `name`, `jury`) VALUES (#{user.username}, #{user.password}, #{user.name}, #{user.jury})")
    public void Insert(@Param("user") User user);
}
