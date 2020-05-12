package com.house.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
@Service("VedioService")
public class VedioServicelmpl implements VedioService{

    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
    SqlSession session = factory.openSession();
    VedioDao vedioDao = session.getMapper(VedioDao.class);

    public VedioServicelmpl() throws IOException {
    }


    @Override
    public List<Vedio> findlast() {
        PageHelper.startPage(10000, 8);
        List<Vedio> list = vedioDao.findAll();
        PageInfo<Vedio> page = new PageInfo<Vedio>(list);
        System.out.println("总数量：" + page.getTotal());
        System.out.println("当前页查询记录：" + page.getList().size());
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("每页显示数量：" + page.getPageSize());
        System.out.println("总页：" + page.getPages());
        return list;
    }
    @Override
    public List<Vedio> findall() {
        PageHelper.startPage(1, 20);
        List<Vedio> list = vedioDao.findAll();
        PageInfo<Vedio> page = new PageInfo<Vedio>(list);
        System.out.println("总数量：" + page.getTotal());
        System.out.println("当前页查询记录：" + page.getList().size());
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("每页显示数量：" + page.getPageSize());
        System.out.println("总页：" + page.getPages());
        return list;
    }
    @Override
    public int getcountAll() {
        System.out.println("统计视频总数");
        return vedioDao.getcountAll();
    }


}
