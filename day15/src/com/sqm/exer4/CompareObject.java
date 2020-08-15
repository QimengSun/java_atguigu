package com.sqm.exer4;

/**
 * @author: sqm
 * @date: 2020/8/14 22:12
 * @description:
 */
public interface CompareObject {
    public int compareTo(Object o);
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
}
