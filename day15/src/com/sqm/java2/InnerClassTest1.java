package com.sqm.java2;

/**
 * @author: sqm
 * @date: 2020/8/14 23:06
 * @description:
 */
public class InnerClassTest1 {
    public void method(){
        //局部内部类
        class AA{

        }
    }

    //返回一个实现了Comparable接口的类的对象
    public Comparable getComparable(){

        //局部内部类
        //标准方式
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }

//        return new MyComparable();

        //匿名
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }


}
