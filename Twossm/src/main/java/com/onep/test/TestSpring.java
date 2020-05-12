package com.house.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CommentService as = (CommentService) ac.getBean("CommentService");
        VedioService vs = (VedioService) ac.getBean("VedioService");
        //as.findAllbyID(1,0,3);
        List<Comment> comments = as.findAllbyID(1,0,3);
        for (Comment comment : comments) {
            System.out.println(comment);
        }
        int counts=as.getcount(1);
        System.out.println("该视频评论数量:"+counts);
        List<Comment> comments2 = as.findAll();
        for (Comment comment : comments2) {
            System.out.println(comment);
        }

        List<Vedio> vedios=vs.findlast();
        for(Vedio vedio : vedios){
            System.out.println(vedio);
        }
        int counts2=vs.getcountAll();
        System.out.println("视频总数:"+counts2);
    }
}
