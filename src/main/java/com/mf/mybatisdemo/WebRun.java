package com.mf.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author apple
 */
@SpringBootApplication
@MapperScan("com.mf.mybatisdemo.mapper")
public class WebRun {

    public static void main(String[] args) {
        SpringApplication.run(WebRun.class, args);
    }
}
