package com.zln.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Description Dto
 * @Author zhuln
 * @Date 2020/4/9 10.39
 * @Version 1.0
 **/
//@Data  =@Setter+@Getter+@EqualsAndHashCode+@NoArgsConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private  Long id;
    private  String serial;


}
