package com.example.demojpa.DTO;


import com.example.demojpa.models.Employee;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateEmployeeRequest {



    private String address;

    @NotEmpty
    private String name;

    @Max(60)
    @Min(18)
    @NotNull
    private Integer age;


    public Employee toEmployee() {
        return Employee.builder().
                address(this.getAddress()).
                name(this.getName()).
                age(this.getAge()).
                build();
    }
}
