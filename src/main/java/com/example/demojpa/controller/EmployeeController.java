package com.example.demojpa.controller;

import com.example.demojpa.models.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return  employee;
    }

}
