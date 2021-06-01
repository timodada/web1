package com.example.web1.controller;

import com.example.web1.pojo.PublicResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description: web控制器
 * @Author lifeng
 * @Date 2021/6/1 11:40
 * @Version 1.0
 */
@RestController
public class TestController {


    @GetMapping
    public PublicResult getTest(){
        return PublicResult.success(1);
    }

}
