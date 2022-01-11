package com.example.lab_7_1;

import java.util.HashMap;

public class Student {
    private String name;
    private String group;
    private Integer course;
    private HashMap<String, Integer> evaluations;//subject, grade
    private static final int LAST_COURSE_NUMBER = 5;
    private static final int MAX_GRADE = 5;

    public Student(String name, String group, Integer course, HashMap<String, Integer> evaluations) throws CourseRangeException, SubjectGradeRangeException {
        this.name = name;
        this.group = group;
        isCourseValid(course);
        isEvaluationsValid(evaluations);
        this.course = course;
        this.evaluations = evaluations;
    }

    private static void isCourseValid(int course) throws CourseRangeException{
           if (course < 0 || course > LAST_COURSE_NUMBER) throw new CourseRangeException();
    }

    private static void isSubjectGradeValid(int grade) throws SubjectGradeRangeException {
        if (grade < 0 || grade > MAX_GRADE) throw new SubjectGradeRangeException();
    }

    private static void isEvaluationsValid(HashMap<String, Integer> evaluations) throws SubjectGradeRangeException {
        for (Integer value : evaluations.values()) {
            isSubjectGradeValid(value);
        }
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) throws CourseRangeException {
        isCourseValid(course);
        this.course = course;
    }

    public HashMap<String, Integer> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(HashMap<String, Integer> evaluations) throws SubjectGradeRangeException {
        isEvaluationsValid(evaluations);
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
