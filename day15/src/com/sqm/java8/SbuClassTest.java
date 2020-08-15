package com.sqm.java8;

/**
 * @author: sqm
 * @date: 2020/8/14 22:39
 * @description:
 */
public class SbuClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
//        s.method1();
        //静态方法只能通过接口调用
        CompareA.method1();
        //公用方法

        s.method2();
        //实现类的对象可以调用默认方法
    }
}

class SubClass implements CompareA{

    public void method2(){
        System.out.println("subclass:上海");
    }
}
