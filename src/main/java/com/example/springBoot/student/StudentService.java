package com.example.springBoot.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Service
public class StudentService {


    public Student getStudent (){
        return new Student("samet",
                26,
                LocalDate.of(2020,10,10),
                "samet@gmail");
    }



}
