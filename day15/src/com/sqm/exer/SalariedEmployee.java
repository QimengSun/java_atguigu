package com.sqm.exer;

/**
 * @author: sqm
 * @date: 2020/8/14 17:06
 * @description:
 */
public class SalariedEmployee extends  Employee{
    private double monthlySalary;


    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earinings() {
        return monthlySalary;
    }

    public String toString(){
        return "SalariedEmployee[" + super.toString() + "]";
    }
}
