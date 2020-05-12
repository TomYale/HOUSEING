package com.house.controller;

import com.house.domain.Tfrecord;
import com.house.service.TfrecordService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MessageController {

    @Autowired
    private TfrecordService tfrecordService;

    @RequestMapping("/tfrecordjsp")
    public String tfrecordjsp(Model model){
        List<Tfrecord> list=tfrecordService.findAll();
        model.addAttribute("list",list);
        return "tfrecordJSP";
    }

    @RequestMapping("/messagejsp")
    public String messagejsp(Model model, HttpServletRequest request, String username, String password){  //存数据， Model对象
        username=request.getParameter("username");
        password=request.getParameter("password");


        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            currentUser.login(token);
            System.out.println("认证成功");
            return "messageJSP";
            //认证成功跳转到成功页面
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("认证失败");
            //失败重新回到登录页面
            return "index";
        }
    }

}
