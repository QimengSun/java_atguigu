package com.sqm.exer2;

/**
 * @author: sqm
 * @date: 2020/8/14 22:04
 * @description:
 */
interface A {
    int x = 0;
}
class B {
    int x = 1;
}
class C extends B implements A {
    public void pX() {
        //System.out.println(x);
        System.out.println(super.x);//父类
        System.out.println(A.x);//A是接口，x是全局敞亮
    }

    public static void main(String[] args) {
        new C().pX();
    }
}
