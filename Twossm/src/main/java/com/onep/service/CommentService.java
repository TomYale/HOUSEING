package com.house.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {

    public List<Comment> findAllbyID(@Param("id") int id, @Param("offset") int offset, @Param("limit") int limit);

    public int getcount(@Param("id") int id);

    public int getcountAll();

    public List<Comment> findAll();
}
