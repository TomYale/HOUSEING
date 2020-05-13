package com.house.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.house.dao.*;
import com.house.domain.*;
import com.house.service.FindallService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Service("TfrecordService")
public class FindallServicelmpl implements FindallService {
    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
    SqlSession session = factory.openSession();

    TfrecordDao tfrecordDao = session.getMapper(TfrecordDao.class);
    HtrecordDao htrecordDao =session.getMapper(HtrecordDao.class);
    LotteryDao lotteryDao =session.getMapper(LotteryDao.class);
    QtrecordDao qtrecordDao=session.getMapper(QtrecordDao.class);
    RecievedDao recievedDao=session.getMapper(RecievedDao.class);
    RosterDao rosterDao=session.getMapper(RosterDao.class);
    UserDao userDao=session.getMapper(UserDao.class);
    WaitingDao waitingDao=session.getMapper(WaitingDao.class);
    WxrecordDao wxrecordDao=session.getMapper(WxrecordDao.class);

    public FindallServicelmpl() throws IOException {
    }



    @Override
    public List<Tfrecord> findtfr() {
        //PageHelper.startPage(1, 20);
        List<Tfrecord> list = tfrecordDao.findAll();
        //PageInfo<Tfrecord> page = new PageInfo<Tfrecord>(list);
        //System.out.println("总数量：" + page.getTotal());
        //System.out.println("当前页查询记录：" + page.getList().size());
        //System.out.println("当前页码：" + page.getPageNum());
        //System.out.println("每页显示数量：" + page.getPageSize());
        //System.out.println("总页：" + page.getPages());
        return list;
    }

    @Override
    public List<Htrecord> findhtr() {
        List<Htrecord> list=htrecordDao.findAll();
        return list;
    }

    @Override
    public List<Qtrecord> findqtr() {
        List<Qtrecord> list=qtrecordDao.findAll();
        return list;
    }

    @Override
    public List<Recieved> findrec() {
        List<Recieved> list=recievedDao.findAll();
        return list;
    }

    @Override
    public List<Roster> findros() {
        List<Roster> list=rosterDao.findAll();
        return list;
    }

    @Override
    public List<User> finduser() {
        List<User> list= userDao.findAll();
        return list;
    }

    @Override
    public List<Waiting> findwait() {
        List<Waiting> list=waitingDao.findAll();
        return list;
    }

    @Override
    public List<Wxrecord> findwxr() {
        List<Wxrecord> list=wxrecordDao.findAll();
        return list;
    }
    @Override
    public List<Lottery> findlot() {
        List<Lottery> list=lotteryDao.findAll();
        return list;
    }
}


