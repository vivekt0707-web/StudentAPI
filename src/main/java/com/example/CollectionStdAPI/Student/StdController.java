package com.example.CollectionStdAPI.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StdController {
    Map<Integer,StudentDetails> map = new HashMap<>();
    List<StudentDetails> lst = new ArrayList<>();
static int counter=1;
    @PostMapping("/create")
    public String postStudent(@RequestBody StudentDetails studentDetails){
      lst.add(studentDetails);
        return "Student added";
    }

    @GetMapping("/get")
    public List<StudentDetails> getStudent(){
      return lst;
    }

    @PostMapping("/createList")
    public String postStudentList(@RequestBody List<StudentDetails> studentDetails){
      lst.addAll(studentDetails);
      return "List added";
    }

    @GetMapping("/getList")
    public List<StudentDetails> getStudentList(){
      return lst;
    }

    @GetMapping("/getMap")
    public Map<Integer,StudentDetails> getStudentDetails() {
        return map;
    }

    @PostMapping("/createMap")
    public String postStudentDetails(@RequestBody List<StudentDetails> studentDetails){
        for(StudentDetails obj :studentDetails){
            System.out.println(obj);
            map.put(counter++,obj);
        }
        //map.put(counter++,studentDetails);
        return "Student data added";

    }

}
