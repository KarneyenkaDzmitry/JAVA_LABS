package com.example.lab_7_2;

public class Department {
    private String name;
    private Integer employeeNumber;

    public Department(String name, Integer employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }
}
