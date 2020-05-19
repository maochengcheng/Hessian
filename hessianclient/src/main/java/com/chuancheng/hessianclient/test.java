package com.chuancheng.hessianclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


public class test {
    @Autowired
    HelloWorldService helloWorldService;
    @RequestMapping("/test")
    public String test(){
        return helloWorldService.sayHello("Spring boot with Hessian.");
    }
}
