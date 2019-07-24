package com.mycloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:cuijialei
 * @Date: 2019/7/24
 * @Describe
 */
@SpringBootApplication
@MapperScan("com.mycloud.mapper")
public class ProductApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class, args);
    }
}
