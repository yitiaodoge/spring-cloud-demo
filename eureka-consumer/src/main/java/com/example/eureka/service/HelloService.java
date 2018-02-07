package com.example.eureka.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate rest;


    @HystrixCommand(fallbackMethod = "ierro")
    public String hello(){
        return rest.getForObject("http://SERVICE-HI/hi",String.class);
    }

    public String ierro(){
        return "erro bitch";
    }
}
