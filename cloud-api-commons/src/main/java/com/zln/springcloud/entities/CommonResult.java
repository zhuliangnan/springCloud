package com.zln.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Description Json封装体 通用返回结果集
 * @Author zhuln
 * @Date 2020/4/9 10.39
 * @Version 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private  Integer code;
    private  String message;
    private  T   data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
