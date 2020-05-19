package com.chuancheng.hessian;

import com.chuancheng.hessian.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

@SpringBootApplication
public class HessianApplication {

    @Autowired
    private HelloWorldService helloWorldService;

    public static void main(String[] args) {
        SpringApplication.run(HessianApplication.class, args);
    }

    //发布服务
    @Bean(name = "/HelloWorldService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(helloWorldService);
        exporter.setServiceInterface(HelloWorldService.class);
        return exporter;
    }
}
