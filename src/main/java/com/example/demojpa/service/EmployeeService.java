package com.example.demojpa.service;


import com.example.demojpa.DTO.CreateEmployeeRequest;
import com.example.demojpa.models.Employee;
import com.example.demojpa.respository.employeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    employeeRepository empRepository;
    public void save(@Valid Employee employee) {
        empRepository.save(employee);

    }
}
