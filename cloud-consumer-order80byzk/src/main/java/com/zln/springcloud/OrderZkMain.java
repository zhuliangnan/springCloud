package com.zln.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author zhuln
 * @Date 2020/4/9 10.39
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain.class,args);
    }
}
