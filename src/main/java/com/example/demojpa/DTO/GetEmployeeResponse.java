package com.example.demojpa.DTO;


import com.example.demojpa.models.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeResponse {
    List<Employee> employeeList;

}
