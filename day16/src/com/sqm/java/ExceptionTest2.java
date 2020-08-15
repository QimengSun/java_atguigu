package com.sqm.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author: sqm
 * @date: 2020/8/15 17:29
 * @description:
 */
public class ExceptionTest2 {

    public static void main(String[] args) {
        try{
            method2();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void method3() {
        try{
            method2();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void method2() throws FileNotFoundException,IOException{
        method1();
    }



    public static void method1() throws FileNotFoundException,IOException{
        FileInputStream fis = null;

        File file = new File("hello.txt");
        fis = new FileInputStream(file);

        int data = fis.read();
        while(data != -1){
            System.out.print((char)data);
            data = fis.read();
        }

        fis.close();
    }
}
