package com.example.sprint1.db;

import com.example.sprint1.models.Student;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Student> students = new ArrayList<>();
    private static Long id = 1L;

    static {
        addStudent(new Student("Ilyas", "Zhaunyshev", 88));
        addStudent(new Student("Serik", "Erikov", 91));
        addStudent(new Student("Erik", "Serikov", 65));
        addStudent(new Student("Nurzhan", "Bolatov", 48));
        addStudent(new Student("Partick", "Zuckerberg", 100));
        addStudent(new Student("Sabina", "Assetova", 33));
        addStudent(new Student("Madina", "Adiletova", 77));
        addStudent(new Student("Karina", "Serzhanova", 51));
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {
        student.setId(id++);

        if (student.getExam() >= 90)
            student.setMark('A');
        else if (student.getExam() >= 75)
            student.setMark('B');
        else if (student.getExam() >= 60)
            student.setMark('C');
        else if (student.getExam() >= 50)
            student.setMark('D');
        else
            student.setMark('F');

        students.add(student);
    }
}
