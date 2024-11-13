package com.example.demojpa.DTO;


import com.example.demojpa.models.Admin;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateAdminRequest {

    @NotNull
    private String name;

    public Admin toAdmin(){
        return Admin.builder().
                name(this.name).build();

    }
}
