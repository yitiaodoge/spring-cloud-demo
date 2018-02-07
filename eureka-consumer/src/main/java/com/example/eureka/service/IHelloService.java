package com.example.eureka.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-hi",fallback = IHelloServiceImpl.class)
public interface IHelloService {

    @RequestMapping(value = "/hi")
    String hello();

}
