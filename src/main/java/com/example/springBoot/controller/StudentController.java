package com.example.springBoot.controller;

import com.example.springBoot.student.Student;
import com.example.springBoot.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
        //this.studentService =  new StudentService();
    }

    @GetMapping(path = "/1")
    public Student getStudent (){
        return studentService.getStudent();
    }

    @GetMapping(path = "/2")
    public String sayHello(){
        return "hello";
    }



}
