package com.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean,DisposableBean,Shape {
//public class Triangle implements InitializingBean, DisposableBean {
//public class Triangle{
//    private List<Point> points;
//
//    public List<Point> getPoints() {
//        return points;
//    }
//
//    public void setPoints(List<Point> points) {
//        this.points = points;
//    }

    private Point pointA;
    private Point pointB;
    private Point pointC;

    private ApplicationContext context;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){

//        for (int i =0;i<getPoints().size();i++) {
//            System.out.println("Point"+ i+" : (" + getPoints().get(i).getX()+ "," +getPoints().get(i).getY()+")");
//        }
        System.out.println("Drawing triangle");
        System.out.println("Point A : (" + getPointA().getX()+ "," +getPointA().getY()+")");
        System.out.println("Point B : (" + getPointB().getX()+ "," +getPointB().getY()+")");
        System.out.println("Point C : (" + getPointC().getX()+ "," +getPointC().getY()+")");
    }

    public void myInit() {
        System.out.println("my init method called");
    }

    public void myDestroy() {
        System.out.println("my destroy method called");
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("setting app context");
        this.context = context;

    }

    @Override
    public void setBeanName(String beanNameame) {
        System.out.println("Bean name is: "+ beanNameame);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean init method called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy bean method called");
    }
    //    private String type;
//    private  int height;
//
//    public int getHeight() {
//        return height;
//    }
//
//
//
//    public Triangle(String type,int height) {
//        this.type = type;
//        this.height = height;
//    }
//
//    public String getType() {
//        return type;
//    }

//    public void setType(String type) {
//        this.type = type;
//    }

//    public void  draw() {
//        System.out.println(getType()+ " Triangle drawn height " + getHeight());
//    }
}
