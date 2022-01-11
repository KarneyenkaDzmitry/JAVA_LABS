package com.example.lab_7_1;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentCollectionTest {
    public static void main(String[] args) throws CourseRangeException, SubjectGradeRangeException {
        Student tilly_McDuck = new Student("Tilly", "v23x", 1, new HashMap<String, Integer>(){{put("Mathematics", 5); put("Physics", 3); put("Subject_1", 2);}});
        Student dilly_McDuck = new Student("Dilly", "v23x", 1, new HashMap<String, Integer>(){{put("Mathematics", 2); put("Physics", 3); put("Subject_1", 3);}});
        Student villy_McDuck = new Student("Villy", "v23x", 1, new HashMap<String, Integer>(){{put("Mathematics", 5); put("Physics", 5); put("Subject_1", 4);}});
        StudentCollection.printStudents(new ArrayList<Student>() {{add(tilly_McDuck); add(dilly_McDuck); add(villy_McDuck);}}, 1);
        StudentCollection.printStudents(new ArrayList<Student>() {{add(tilly_McDuck); add(dilly_McDuck); add(villy_McDuck);}}, 2);
        StudentCollection students = new StudentCollection(new ArrayList<Student>() {{add(tilly_McDuck); add(dilly_McDuck); add(villy_McDuck);}});
        students.processCourseEvaluations();
        StudentCollection.printStudents(students.getStudents(), 2);
//        StudentCollection.printStudents(students.getStudents(), 3);

        try {
            tilly_McDuck.setCourse(6);
        } catch (CourseRangeException e) {
            System.out.println("The CourseRangeException Exception is thrown:\n" + e.getStackTrace());
        }

        try {
            Student scrooge_McDuck = new Student("Scrooge", "v23x", -1, new HashMap<String, Integer>(){{put("Mathematics", 5); put("Physics", 3); put("Subject_1", 2);}});
        } catch (CourseRangeException e) {
            System.out.println("The CourseRangeException Exception is thrown:\n" + e.getStackTrace());
        }

        try {
            tilly_McDuck.setEvaluations(new HashMap<String, Integer>(){{put("Mathematics", 2); put("Physics", 6); put("Subject_1", 3);}});
        } catch (SubjectGradeRangeException e) {
            System.out.println("The SubjectGradeRangeException Exception is thrown:\n" + e.getStackTrace());
        }

        try {
            Student scrooge_McDuck = new Student("Scrooge", "v23x", 2, new HashMap<String, Integer>(){{put("Mathematics", -1); put("Physics", 3); put("Subject_1", 2);}});
        } catch (SubjectGradeRangeException e) {
            System.out.println("The SubjectGradeRangeException Exception is thrown:\n" + e.getStackTrace());
        }
    }
}
