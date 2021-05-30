package com.hj.adminserver.controller;


import com.hj.adminserver.pojo.User;
import com.hj.adminserver.service.Userservice;
import com.hj.adminserver.ss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.StandardServletAsyncWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    Userservice userservice;

    @GetMapping("/getAll")
    public List<User> getAll()
    {
        return userservice.findAll();
    }


    @GetMapping("/as")
    public String dow(HttpSession httpSession)
    {
       httpSession.setAttribute("s",1);
       System.out.println(httpSession);
        return "sss";
    }

    @RequestMapping("/sessionTest")
    @ResponseBody
    public void sessionTest(HttpServletRequest request){
        request.getSession().setAttribute("name","zwq");
        //销毁session
        request.getSession().invalidate();
    }


}
