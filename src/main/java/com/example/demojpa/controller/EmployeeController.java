package com.example.demojpa.controller;

import com.example.demojpa.DTO.CreateEmployeeRequest;
import com.example.demojpa.models.Employee;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody @Valid CreateEmployeeRequest employee) {
        return employee.toEmployee();
    }

}
