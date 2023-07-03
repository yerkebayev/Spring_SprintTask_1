package com.example.sprint1.models;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private Character mark;

    public Student(String name, String surname, int exam) {
        this.name = name;
        this.surname = surname;
        this.exam = exam;
    }
}
