package com.example.springBoot.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class StudentService {

    public List<Student> getStudent (){
        return List.of(
                new Student(
                        1,
                        "samet",
                        26,
                        LocalDate.of(1983,10,25),
                        "samet@gmail.com"
                )
        );
    }
}
