package com.example.sprint1.controllers;

import com.example.sprint1.db.DBManager;
import com.example.sprint1.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class IndexController {

    @GetMapping(value = { "/", "/home" })
    public String index(Model model) {
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping(value = "/addStudent")
    public String getAddStudent() {
        return "addStudent";
    }

    @PostMapping(value = "/addStudent")
    public String addStudent(
            @RequestParam(name = "name", defaultValue = "") String name,
            @RequestParam(name = "surname", defaultValue = "") String surname,
            @RequestParam(name = "exam", defaultValue = "0") int exam
    ) {
        DBManager.addStudent(new Student(name, surname, exam));
        return "redirect:/";
    }
}
