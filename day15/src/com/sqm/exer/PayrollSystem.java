package com.sqm.exer;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author: sqm
 * @date: 2020/8/14 17:19
 * @description:
 */
public class PayrollSystem {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("月份");
//        int month = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);



        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("马森",1002,
                new MyDate(1992,2,28),10000);
        emps[1] = new HourlyEmployee("潘一",2001,
                new MyDate(1991,8,6),240,50);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earinings();
            System.out.println("salary = " + salary);

            if (month + 1 == emps[i].getBirthday().getMonth()) {
                System.out.println("100");
            }
        }
    }
}
