package com.example.demojpa.respository;

import com.example.demojpa.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<Employee, Integer> {

}
