package com.example.eureka.controller;


import com.example.eureka.service.IHelloService;
import com.example.eureka.service.HelloService;
import com.example.eureka.service.IHelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @Autowired
    private IHelloService iHelloService;

    @RequestMapping(value = "/hi")
    public String hello(){
        return service.hello();
    }

    @RequestMapping(value = "/ihi")
    public String ihello(){
        return iHelloService.hello();
    }

}
