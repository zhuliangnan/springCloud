package com.zln.springcloud.dao;


import com.zln.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    //写操作
    public  int create(Payment payment);

    //读操作
    public  Payment getPaymentByid(@Param("id") Long id);
}
