package com.example.demojpa.controller;

import com.example.demojpa.DTO.CreateEmployeeRequest;
import com.example.demojpa.DTO.GetEmployeeResponse;
import com.example.demojpa.models.Employee;
import com.example.demojpa.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getEmployee/all")
    public GetEmployeeResponse getAllEmployees(){

        return GetEmployeeResponse.builder().employeeList(employeeService.getAll()).build();
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeByID(@PathVariable int id){
        return employeeService.getById(id);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeeByID(@PathVariable int id){
        Employee deletedEmp=employeeService.deleteById(id);
        return deletedEmp.getName()+ " deleted";
    }

}
