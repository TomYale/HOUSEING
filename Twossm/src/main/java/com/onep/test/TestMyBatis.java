package com.house.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

 //   @Test
    public void insert1() throws IOException {
        Account account =new Account();
        account.setName("鄢寒");  //备注：鄢寒是我小学同班的一个女孩子的名字，哈哈，挺怀念的~
        account.setMoney(200d);
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        IAccountdao dao = session.getMapper(IAccountdao.class);

        // 保存
        dao.saveAccount(account);

        // 提交事务
        session.commit();

        // 关闭资源
        session.close();
        in.close();
    }

   // @Test
    public void checkaccount() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        IAccountdao dao = session.getMapper(IAccountdao.class);

        List<Account> list = dao.findAll();
        for (Account account: list ) {
            System.out.println(account);
        }

        session.close();
        in.close();
    }

    @Test
    public void testQuery() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();
        CommentDao dao = session.getMapper(CommentDao.class);
        VedioDao dao2 = session.getMapper(VedioDao.class);

        List<Comment> comments = dao.findAllbyID(1,0,3);
        for (Comment comment : comments) {
            System.out.println(comment);
        }

        int counts=dao.getcount(1);
        System.out.println("该视频评论数量:"+counts);

        List<Comment> comments2 = dao.findAll();
        for (Comment comment : comments2) {
            System.out.println(comment);
        }
        PageHelper.startPage(1, 3);
        List<Vedio> vedios=dao2.findAll();
        PageInfo<Vedio> page = new PageInfo<Vedio>(vedios);
        System.out.println("总数量：" + page.getTotal());
        System.out.println("当前页查询记录：" + page.getList().size());
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("每页显示数量：" + page.getPageSize());
        System.out.println("总页：" + page.getPages());
        for(Vedio vedio : vedios){
            System.out.println(vedio);
        }
    }
}
