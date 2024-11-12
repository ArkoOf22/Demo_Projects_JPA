package com.example.demojpa.models;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import lombok.*;
//import org.hibernate.annotations.IdGeneratorType;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private String address;

}