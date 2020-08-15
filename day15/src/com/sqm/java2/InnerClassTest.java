package com.sqm.java2;

/**
 * @author: sqm
 * @date: 2020/8/14 22:53
 * @description:内部类
 * 内部类：成员内部类 vs 局部内部类
 */
public class InnerClassTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 10;
    }
}

class Person{
    static int age = 10;
    String name;

    //成员内部类 定义 属性 方法 构造器
    class Brain{

    }

    public void method(){
        //局部内部类
        class AA{

        }
    }

    public Person(){
        //局部内部类
        class CC{

        }
    }

    {
        //局部内部类
        class CC {
    }
    }

}
