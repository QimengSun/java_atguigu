package com.sqm.java;

/**
 * @author: sqm
 * @date: 2020/8/14 16:23
 * @description:
 */


public class AbstractPerson {
    public static void main(String[] args) {
        Person p1 = new Student();//多态
        p1.walk();
    }
}



abstract class Person{
    String name;
    int age;

    public Person(){

    }

     public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat");
    }

    //抽象方法
    public abstract void walk();
}

class Student extends Person{

    @Override
    public void walk() {
        System.out.println("walk");
    }
}
