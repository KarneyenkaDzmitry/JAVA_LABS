package com.example.lab_4_2;

public class FixPaidEmployee extends Employee {
    private double monthlyPaidSalary = 1.0;

    @Override
    public Double calculateSalary() {
        return getMonthlyPaidSalary();
    }

    public double getMonthlyPaidSalary() {
        return monthlyPaidSalary;
    }

    public void setMonthlyPaidSalary(double monthlyPaidSalary) {
        this.monthlyPaidSalary = monthlyPaidSalary;
    }
}
