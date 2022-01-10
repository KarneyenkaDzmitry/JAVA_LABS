package com.example.lab_5_2;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class StudentCollection {
    private List<Student> students;

    StudentCollection(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void deductOnAcademicFailure(){
        students.removeIf(student -> calculateAnAverageGrade(student) < 3.0);
    }

    private Double calculateAnAverageGrade(Student student){
        HashMap<String, Integer> evaluations = student.getEvaluations();
        Collection<Integer> grades = evaluations.values();
        final int[] sum = {0};
        grades.forEach(grade-> sum[0] += grade) ;
        double result = sum[0] / evaluations.size();
        return result;
    }

    public void processCourseEvaluations(){
        deductOnAcademicFailure();
        students.forEach(student-> {
            int course = student.getCourse();
            student.setCourse(++course);
        });
    }

    public static void printStudents(List<Student> students, int course){
        students.forEach(student->{
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        });
    }
}
