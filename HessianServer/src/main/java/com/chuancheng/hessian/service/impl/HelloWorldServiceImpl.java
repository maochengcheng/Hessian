package com.chuancheng.hessian.service.impl;

import com.chuancheng.hessian.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello(String name) {
        return "Hello World! " + name;
    }
}
