package com.qf.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    //系统首页模块
    @RequestMapping(value = {"/","home"})
    public String login(){
        return "/index.jsp";
    }
    @RequestMapping(value = "fmain")
    public String fmain(){
        return "/home/famain.jsp";
    }
    public String title(){
        return "/home/title.jsp";
    }
}
