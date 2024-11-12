package com.example.demojpa.controller;

import com.example.demojpa.DTO.CreateEmployeeRequest;
import com.example.demojpa.models.Employee;
import com.example.demojpa.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody @Valid CreateEmployeeRequest employee) {

        //Converting the DTO to the model
        Employee newEmployee=employee.toEmployee();

        employeeService.save(newEmployee);

        return newEmployee;
    }

}
