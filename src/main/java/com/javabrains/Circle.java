package com.javabrains;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.xml.ws.RespectBinding;
@Component
public class Circle  implements Shape, ApplicationEventPublisherAware {

    private Point center;
    private ApplicationEventPublisher publisher;
    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
        return center;
    }

    //@Required
    //@Autowired
    //@Qualifier("circleRelated")
    @Resource(name="pointC")
    //@Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        //System.out.println("Drawing circle");
        System.out.println(this.messageSource.getMessage("drawing.circle",null,"Default Greeting",null));
        System.out.println(this.messageSource.getMessage("drawing.point",new Object[] { getCenter().getX(),getCenter().getY()},"Default point message",null));
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
        //System.out.println("Circle: Point is :("+getCenter().getX()+"," +getCenter().getY()+")");
        //System.out.println(this.messageSource.getMessage("greeting",null,"Default Greeting",null));
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("init of circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("destroy of circle");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
