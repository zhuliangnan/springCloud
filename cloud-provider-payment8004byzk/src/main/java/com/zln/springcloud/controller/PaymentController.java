package com.zln.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author zhuln
 * @Date 2020/4/9 10.39
 * @Version 1.0
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private  String serverPort;


    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){

        return  "springcloud with zookeeper : "+serverPort+"\t"+ UUID.randomUUID().toString();
    }


}