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
public class ExceptionTest1 {
    @Test
    public void test1(){

        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("Hello-----1");
        }catch (NumberFormatException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Hello-----2");

    }

    @Test
    public void test7() {

        FileInputStream fis = null;

        try{
            File file = new File("hello.txt");
            fis = new FileInputStream(file);

            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
                data = fis.read();
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fis != null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
