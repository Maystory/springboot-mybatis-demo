package com.mf.mybatisdemo.service.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author mf
 * @since 2019-05-16 22:06
 */
public class HelloEvent extends ApplicationEvent {

    private String msg;

    public HelloEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}