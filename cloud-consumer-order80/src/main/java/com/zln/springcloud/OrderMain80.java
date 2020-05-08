package com.zln.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author zhuln
 * @Date 2020/4/9 10.39
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {


    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
