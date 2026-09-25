package com.example.CollectionStdAPI.Student;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
public class StudentDetails {
    private int id;
    //@NotBlank(message = "Name is mandatory")
    private String name;
    //@NotNull
    private String dept;
    //private String country;


}
