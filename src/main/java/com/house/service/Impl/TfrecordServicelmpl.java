package com.house.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.dao.TfrecordDao;
import com.house.domain.Tfrecord;
import com.house.service.TfrecordService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Service("TfrecordService")
public class TfrecordServicelmpl implements TfrecordService {
    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
    SqlSession session = factory.openSession();
    TfrecordDao tfrecordDao = session.getMapper(TfrecordDao.class);


    public TfrecordServicelmpl() throws IOException {
    }


    @Override
    public List<Tfrecord> findAll() {
        PageHelper.startPage(1, 20);
        List<Tfrecord> list = tfrecordDao.findAll();
        PageInfo<Tfrecord> page = new PageInfo<Tfrecord>(list);
        System.out.println("总数量：" + page.getTotal());
        System.out.println("当前页查询记录：" + page.getList().size());
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("每页显示数量：" + page.getPageSize());
        System.out.println("总页：" + page.getPages());
        return list;
    }
}


