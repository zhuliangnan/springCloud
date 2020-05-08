package com.zln.springcloud.controller;

import com.zln.springcloud.entities.CommonResult;
import com.zln.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author zhuln
 * @Date 2020/4/9 10.39
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderZKController {
    //public static final String  PAYMENT_URL = "http://localhost:8001";
    //服务提供者的微服务名称
    public static final String  INVOKE_URL = "http://cloud-provider-payment";


    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentinfo(){

        return  restTemplate.getForObject(INVOKE_URL +"/payment/zk",String.class);
    }


}
