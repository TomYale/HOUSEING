package com.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MessageController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private VedioService vedioService;


    @RequestMapping("/comment/findAll")
    public String findAll(Model model){  //存数据， Model对象
        System.out.println("CommentController表现层：查询所有评论...");
        // 调用service的方法
        List<Comment> list = commentService.findAll();
        model.addAttribute("list",list);
        return "list2";
    }

    @RequestMapping("/messagejsp")
    public String messagejsp(Model model){  //存数据， Model对象
        System.out.println("综合Controller表现层：登陆成功，查询展示初始页面所需信息...");
        // 调用service的方法
        List<Comment> commentlist = commentService.findAll();//获取所有评论
        model.addAttribute("commentlist",commentlist);

        int commentcount=commentService.getcountAll();//获取评论总数
        model.addAttribute("commentcount",commentcount);

        List<Vedio> vediolist=vedioService.findlast();//最后8个视频
        model.addAttribute("vediolist",vediolist);

        int vediocount=vedioService.getcountAll();//获取视频总数
        model.addAttribute("vediocount",vediocount);
        return "messageJSP";
    }
    @RequestMapping("/vediojsp")
    public String vediojsp(Model model){  //存数据， Model对象
        System.out.println("综合Controller表现层：登陆成功，查询展示初始页面所需信息...");
        // 调用service的方法
        List<Comment> commentlist = commentService.findAll();//获取所有评论
        model.addAttribute("commentlist",commentlist);

        int commentcount=commentService.getcountAll();//获取评论总数
        model.addAttribute("commentcount",commentcount);

        List<Vedio> vediolist=vedioService.findlast();//最后8个视频
        model.addAttribute("vediolist",vediolist);

        int vediocount=vedioService.getcountAll();//获取视频总数
        model.addAttribute("vediocount",vediocount);
        return "vedioJSP";
    }
}
