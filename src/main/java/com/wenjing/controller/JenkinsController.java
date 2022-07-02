package com.wenjing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
    @RequestMapping("hello")
    public String hello(){
        return  "Hello Jenkins!";
    }

    @RequestMapping("trigger1")
    public String trigger1(){
        return "Jenkins is triggered be github!";
    }
}
