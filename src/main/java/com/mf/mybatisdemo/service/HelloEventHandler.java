package com.mf.mybatisdemo.service;

import com.mf.mybatisdemo.mapper.DepartmentMapper;
import com.mf.mybatisdemo.service.event.HelloEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author mf
 * @since 2019-05-16 22:04
 */
@Service
public class HelloEventHandler extends PublishEventService {


    @Autowired
    private DepartService departService;

    @EventListener
    @Async
    public void handler(HelloEvent event) {

        System.out.println("处理事件：" + event.getMsg() + System.currentTimeMillis());

    }

}