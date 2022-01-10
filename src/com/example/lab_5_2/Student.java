package com.example.lab_5_2;

import java.util.HashMap;

public class Student {
    private String name;
    private String group;
    private Integer course;
    private HashMap<String, Integer> evaluations;//subject, grade

    public Student(String name, String group, Integer course, HashMap<String, Integer> evaluations) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.evaluations = evaluations;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public HashMap<String, Integer> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(HashMap<String, Integer> evaluations) {
        this.evaluations = evaluations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }
}
