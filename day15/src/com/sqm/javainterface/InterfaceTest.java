package com.sqm.javainterface;

/**
 * @author: sqm
 * @date: 2020/8/14 17:44
 * @description:
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();
        plane.fly();

    }
}

//3.1 JDK7 以前
//      全局常量public static final、
//      抽象方法
//3.2 JDK8 静态方法 默认方法
//接口通过类的实现的方式来使用
//可以实现多个接口 接口之间可以多继承
interface Attackable{
    void attack();
}

interface Flyable{

    //全局常量
    int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    //抽象方法
    void fly();
    void stop();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}

class Kite implements Flyable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}

class Bullet implements Attackable,Flyable{//多实现

    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}
