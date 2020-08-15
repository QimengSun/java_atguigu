package com.sqm.exer4;

/**
 * @author: sqm
 * @date: 2020/8/14 22:16
 * @description:
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof CompareObject){
            ComparableCircle c = (ComparableCircle)o;
//          return (int) (this.getRadius() - c.getRadius());
//            if (this.getRadius() >= c.getRadius()) {
//                return 1;
//            }
//            if (this.getRadius() <= c.getRadius()) {
//                return -1;
//            }else{
//                return 0;
//            }
            //调用包装类方法
            return this.getRadius().compareTo(c.getRadius());
        }
        else{
//            return 0;
            throw new RuntimeException("数据类型不匹配");
        }
    }
}
