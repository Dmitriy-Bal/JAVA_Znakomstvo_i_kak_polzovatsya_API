package org.example.ClassWork.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Student> students = create();

        for (int i = 0; i < students.size(); i++) {
            int sumMarks = 0;

            for (int mark : students.get(i).getMarks()) {
                sumMarks += mark;
            }

            if (students.get(i).getSurname().endsWith("ова") && sumMarks % 2 == 0) {
                System.out.println(students.get(i).getSalary());
            }

        }
    }

    public static List<Student> create(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов", 1, 10_000, List.of(3, 4, 5)));
        students.add(new Student("Леонова", 1, 20_001, List.of(3, 5, 4)));
        students.add(new Student("Гаврилова", 1, 30_000, List.of(2, 4, 3)));
        students.add(new Student("Матросова", 1, 40_004, List.of(3, 4, 3)));

        return students;
    }
}
