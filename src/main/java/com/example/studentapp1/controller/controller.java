package com.example.studentapp1.controller;

import com.example.studentapp1.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class controller {

    List<Student> studentList = new ArrayList<>();

    @PostMapping("/create")
   String createStudent(@RequestBody Student student){

        studentList.add(student);

        return "Student data added";
    }

    @GetMapping("/get")
    List getStudent(){
        return studentList;
    }
}
