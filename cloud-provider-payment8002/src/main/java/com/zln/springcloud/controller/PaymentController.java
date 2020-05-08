package com.zln.springcloud.controller;

import com.zln.springcloud.entities.CommonResult;
import com.zln.springcloud.entities.Payment;
import com.zln.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
public class PaymentController {

    @Value("${server.port}")
    private  String serverPort;

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

}
