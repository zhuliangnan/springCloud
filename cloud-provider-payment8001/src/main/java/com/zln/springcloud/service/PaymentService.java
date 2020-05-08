package com.zln.springcloud.service;

import com.zln.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author zhuln
 * @Date 2020/4/9 10.39
 * @Version 1.0
 **/
public interface PaymentService {

    //写操作
    public  int create(Payment payment);

    //读操作
    public  Payment getPaymentByid(@Param("id") Long id);
}
