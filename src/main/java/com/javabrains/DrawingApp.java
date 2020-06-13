package com.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



public class DrawingApp {

    public static void main(String[] args) {
        //Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        //ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/spring.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/spring.xml");
        context.registerShutdownHook();
        //Shape shape = (Shape) context.getBean("triangle-alias");
        Shape shape = (Shape) context.getBean("circle");

        //Triangle triangle = (Triangle) context.getBean("triangle2");
        shape.draw();
        //System.out.println(context.getMessage("greeting",null,"Default Greeting",null));
    }


}
