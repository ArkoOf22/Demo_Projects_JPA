package com.example.demojpa.service;


import com.example.demojpa.DTO.CreateEmployeeRequest;
import com.example.demojpa.models.Employee;
import com.example.demojpa.respository.employeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    employeeRepository empRepository;
    public void save(@Valid Employee employee) {
        empRepository.save(employee);

    }

    public List<Employee> getAll(){
        return empRepository.findAll();
    }

    public Employee getById(int id) {
        return empRepository.findById(id).get();
    }

    public Employee deleteById(int id) {
        Employee employee = empRepository.findById(id).get();
        empRepository.delete(employee);
        return employee;
    }

    public Employee updateEmployee(int id, Employee employee) {
        Employee employee1 = empRepository.findById(id).get();
        employee1.setName(employee.getName());
        employee1.setAddress(employee.getAddress());
        employee1.setAge(employee.getAge());
        empRepository.save(employee1);
        return employee1;
    }
}
