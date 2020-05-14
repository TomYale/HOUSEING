package com.house.controller;

import com.house.domain.Tfrecord;
import com.house.domain.User;
import com.house.service.FindallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class InsertController {
    @Autowired
    private FindallService findallService;

    @RequestMapping("/messsage/adduser")
    public String adduserjsp(Model model,HttpServletRequest request,String username,String password,String name,String juri) throws IOException {
        User user = new User();
        username=request.getParameter("ausername");
        password=request.getParameter("apassword");
        name=request.getParameter("aname");
        juri=request.getParameter("ajuri");
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setJury(juri);
        findallService.insertuser(user);
        List<User> list= findallService.finduser();
        model.addAttribute("list",list);
        return "userJSP";
    }
}
