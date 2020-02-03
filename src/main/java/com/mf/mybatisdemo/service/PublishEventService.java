package com.mf.mybatisdemo.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author mf
 * @since 2019-05-16 22:02
 *
 */
public abstract class PublishEventService implements ApplicationEventPublisherAware {

    private  ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher =applicationEventPublisher;
    }
}