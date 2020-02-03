package com.mf.mybatisdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author apple
 */
@SpringBootApplication
@EnableAsync
public class WebRun {

    public static void main(String[] args) {
        SpringApplication.run(WebRun.class, args);
    }
}
