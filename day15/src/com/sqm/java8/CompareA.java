package com.sqm.java8;

/**
 * @author: sqm
 * @date: 2020/8/14 22:37
 * @description:
 */
public interface CompareA {
    //静态方法
    public static void method1() {
        System.out.println("A:北京");
    }

    //默认方法
    public default void method2(){
        System.out.println("A:上海");
    }
}
