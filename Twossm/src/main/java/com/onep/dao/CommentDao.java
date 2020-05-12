package com.house.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentDao {

    /*基于mybatis的注解开发，使用的是注解，如果看不懂再温顾mybatis吧~*/
    @Select("SELECT\n" +
            "\t\tcommentID,\n" +
            "        username,\n" +
            "        comment,\n" +
            "        commentTIME,\n" +
            "        vedioID,\n" +
            "        UID\n" +
            "        FROM\n" +
            "        comment\n" +
            "        WHERE\n" +
            "        vedioID = #{id}\n" +
            "\t\tORDER BY\n" +
            "\t\tcommentTIME\n" +
            "        LIMIT #{offset}, #{limit}")
    public List<Comment> findAllbyID(@Param("id") int id, @Param("offset") int offset, @Param("limit") int limit);

    @Select("SELECT COUNT(comment) FROM comment WHERE vedioID = #{id}")
    public int getcount(@Param("id") int id);

    @Select("SELECT COUNT(comment) FROM comment")
    public int getcountAll();

    @Select("SELECT* FROM comment")
    public List<Comment> findAll();
}
