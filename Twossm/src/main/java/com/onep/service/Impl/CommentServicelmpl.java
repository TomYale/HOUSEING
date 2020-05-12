package com.house.service.Impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("CommentService")
public class CommentServicelmpl implements CommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public List<Comment> findAllbyID(@Param("id") int id, @Param("offset") int offset, @Param("limit") int limit) {
        System.out.println("查询vedioid为"+id+"的所有评论");
        return commentDao.findAllbyID(id, offset, limit);
    }

    @Override
    public int getcount(@Param("id") int id) {
        System.out.println("查询vedioid为"+id+"的评论总数");
        return commentDao.getcount(id);
    }

    @Override
    public int getcountAll() {
        System.out.println("查询数据库中所有评论的数目");
        return commentDao.getcountAll();
    }

    @Override
    public List<Comment> findAll() {
        System.out.println("直接查询所有评论");
        return commentDao.findAll();
    }

}
