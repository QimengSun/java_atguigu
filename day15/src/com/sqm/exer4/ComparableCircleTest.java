package com.sqm.exer4;

/**
 * @author: sqm
 * @date: 2020/8/14 22:28
 * @description:
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.5);
        ComparableCircle c2 = new ComparableCircle(3.6);
//        int c3 = 0;
        System.out.println(c1.compareTo(c2));;

    }
}
