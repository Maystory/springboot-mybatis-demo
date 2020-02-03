package com.mf.mybatisdemo.controller;

import com.mf.mybatisdemo.service.HelloEventHandler;
import com.mf.mybatisdemo.service.event.HelloEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mf
 * @since 2019-05-16 22:08
 */
@RestController
public class TestController {

    @Autowired
    private HelloEventHandler helloEventHandler;


    @GetMapping("/event")
    public Long testEvent() {

        helloEventHandler.handler(new HelloEvent(this,"事件测试"));
        return System.currentTimeMillis();
    }
}