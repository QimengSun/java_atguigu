package com.sqm.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

/**
 * @author: sqm
 * @date: 2020/8/15 17:13
 * @description:
 */

/*
  Error不可处理
  Exception可以处理
 */
public class ExceptionTest {

    //NullPointerException
    @Test
    public void test1(){

//		int[] arr = null;
//		System.out.println(arr[3]);

        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));

    }

    //IndexOutOfBoundsException
    @Test
    public void test2(){
        //ArrayIndexOutOfBoundsException
//		int[] arr = new int[10];
//		System.out.println(arr[10]);

        //StringIndexOutOfBoundsException
        String str = "abc";
        System.out.println(str.charAt(3));
    }

    //ClassCastException
    @Test
    public void test3(){
        Object obj = new Date();
        String str = (String)obj;
    }

    @Test
    public void test4(){

        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);


    }

    //InputMismatchException
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);

        scanner.close();
    }

    //ArithmeticException
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    //******************以下是编译时异常***************************
    @Test
    public void test7() {
//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);
//
//		int data = fis.read();
//		while(data != -1){
//			System.out.print((char)data);
//			data = fis.read();
//		}
//
//		fis.close();
    }

}
