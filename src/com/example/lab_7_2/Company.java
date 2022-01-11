package com.example.lab_7_2;

import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
