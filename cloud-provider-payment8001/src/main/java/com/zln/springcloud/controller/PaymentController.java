package com.zln.springcloud.controller;

import com.zln.springcloud.entities.CommonResult;
import com.zln.springcloud.entities.Payment;
import com.zln.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private DiscoveryClient discoveryClient; //通过服务发现来 发现直自己的服务信息  当然这个应该写到客户端

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****结果"+result);

        if(result > 0) {
            return new CommonResult(200, "插入数据成功,serverPort: "+serverPort,result);
        }else {
            return  new CommonResult(444,"插入数据失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentByid(@PathVariable("id") Long id ){
        Payment payment = paymentService.getPaymentByid(id);
        log.info("*****结果"+payment);

        if(payment != null) {
            return new CommonResult(200, "查询成功，serverPort："+serverPort,payment);
        }else {
            return  new CommonResult(444,"查询失败");
        }
    }
    @GetMapping(value = "/payment/discovery")
    public  Object discovery(){

        List<String> services = discoveryClient.getServices();

        //服务清单列表
        for (String element : services) {
            log.info(" *******element: " + element);
            
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+ "\t" + instance.getHost()+ "\t" + instance.getPort()+ "\t"+instance.getUri());
        }

        return  this.discoveryClient;

    }

}
