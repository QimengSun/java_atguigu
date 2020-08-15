package com.sqm.java3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author: sqm
 * @date: 2020/8/14 18:07
 * @description:
 */
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //1. 非匿名类 非匿名对象
        Flash flash = new Flash(); //接口的多态性 有usb的类型
        com.transferData(flash);

        //2. 非匿名类 匿名对象
        com.transferData(new Printer());

        //3. 匿名类 非匿名对象
        USB phone =new USB(){

            public void start(){
                System.out.println("u start");
            }

            public void stop(){
                System.out.println("u stop");
            }
        };

        //4. 匿名类 匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3-s");
            }

            @Override
            public void stop() {
                System.out.println("mp3-e");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){//数据类型 不是对象
        usb.start();
        System.out.println("data");
        usb.stop();
    }
}

interface USB{
    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("u start");
    }

    @Override
    public void stop() {
        System.out.println("u stop");
    }
}


class Printer implements USB{

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}