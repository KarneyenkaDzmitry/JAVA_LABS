package com.example.lab_5_2;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentCollectionTest {
    public static void main(String[] args) {
        Student tilly_MacDuck = new Student("Tilly", "v23x", 1, new HashMap<String, Integer>(){{put("Mathematics", 5); put("Physics", 3); put("Subject_1", 2);}});
        Student dilly_MacDuck = new Student("Dilly", "v23x", 1, new HashMap<String, Integer>(){{put("Mathematics", 2); put("Physics", 3); put("Subject_1", 3);}});
        Student villy_MacDuck = new Student("Villy", "v23x", 1, new HashMap<String, Integer>(){{put("Mathematics", 5); put("Physics", 5); put("Subject_1", 4);}});
        StudentCollection.printStudents(new ArrayList<Student>() {{add(tilly_MacDuck); add(dilly_MacDuck); add(villy_MacDuck);}}, 1);
        StudentCollection.printStudents(new ArrayList<Student>() {{add(tilly_MacDuck); add(dilly_MacDuck); add(villy_MacDuck);}}, 2);
        StudentCollection students = new StudentCollection(new ArrayList<Student>() {{add(tilly_MacDuck); add(dilly_MacDuck); add(villy_MacDuck);}});
        students.processCourseEvaluations();
        StudentCollection.printStudents(students.getStudents(), 2);
//        StudentCollection.printStudents(students.getStudents(), 3);
    }
}
