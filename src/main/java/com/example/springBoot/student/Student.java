package com.example.springBoot.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "names")
    private String name;
    @Column(name = "ages")
    private int age;
    @Column(name = "birth_of_date")
    private LocalDate birtDate;
    private String email;

    public Student() {
    }

    public Student(int id, String name, int age, LocalDate birtDate, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birtDate = birtDate;
        this.email = email;
    }

    public Student(String name, int age, LocalDate birtDate, String email) {
        this.name = name;
        this.age = age;
        this.birtDate = birtDate;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birtDate=" + birtDate +
                ", email='" + email + '\'' +
                '}';
    }
}
