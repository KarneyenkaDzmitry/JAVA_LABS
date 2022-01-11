package com.example.lab_7_2;

public abstract class Employee {
    private NameIdentity identity;
    private String position;
    private Double rate;

    public abstract Double calculateSalary();
}
