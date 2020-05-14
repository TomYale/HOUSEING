package com.house.controller;

import com.house.domain.*;
import com.house.service.FindallService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MessageController {

    @Autowired
    private FindallService findallService;

    @RequestMapping("/messsage/tfrecord")
    public String tfrecordjsp(Model model){
        List<Tfrecord> list= findallService.findtfr();
        model.addAttribute("list",list);
        return "tfrecordJSP";
    }
    @RequestMapping("/messsage/htrecord")
    public String htrecordjsp(Model model){
        List<Htrecord> list= findallService.findhtr();
        model.addAttribute("list",list);
        return "htrecordJSP";
    }
    @RequestMapping("/messsage/lottery")
    public String lotteryjsp(Model model){
        List<Lottery> list= findallService.findlot();
        model.addAttribute("list",list);
        return "lotteryJSP";
    }
    @RequestMapping("/messsage/qtrecord")
    public String qtrecordjsp(Model model){
        List<Qtrecord> list= findallService.findqtr();
        model.addAttribute("list",list);
        return "qtrecordJSP";
    }
    @RequestMapping("/messsage/recieved")
    public String recievedjsp(Model model){
        List<Recieved> list= findallService.findrec();
        model.addAttribute("list",list);
        return "recievedJSP";
    }
    @RequestMapping("/messsage/roster")
    public String rosterjsp(Model model){
        List<Roster> list= findallService.findros();
        model.addAttribute("list",list);
        return "rosterJSP";
    }
    @RequestMapping("/messsage/htdqlist")
    public String htdqlistjsp(Model model){
        List<Roster> list= findallService.findhtdq();
        model.addAttribute("list",list);
        return "htdqlistJSP";
    }
    @RequestMapping("/messsage/user")
    public String userjsp(Model model){
        List<User> list= findallService.finduser();
        model.addAttribute("list",list);
        return "userJSP";
    }
    @RequestMapping("/messsage/waiting")
    public String waitingjsp(Model model){
        List<Waiting> list= findallService.findwait();
        model.addAttribute("list",list);
        return "waitingJSP";
    }
    @RequestMapping("/messsage/wxrecord")
    public String wxrecordjsp(Model model){
        List<Wxrecord> list= findallService.findwxr();
        model.addAttribute("list",list);
        return "wxrecordJSP";
    }


    @RequestMapping("/message")
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
