package com.example.business.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

    @RequestMapping("/")
//    @ResponseBody
    public String sayHello(){
        return "/index.html";
    }
}
