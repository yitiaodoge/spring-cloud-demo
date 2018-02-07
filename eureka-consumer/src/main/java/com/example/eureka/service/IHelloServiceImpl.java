package com.example.eureka.service;


import org.springframework.stereotype.Component;

@Component
public class IHelloServiceImpl implements IHelloService{
    @Override
    public String hello() {
        return "service erro";
    }
}
