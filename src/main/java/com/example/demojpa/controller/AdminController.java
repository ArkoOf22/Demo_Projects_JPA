package com.example.demojpa.controller;

import com.example.demojpa.DTO.CreateAdminRequest;
import com.example.demojpa.models.Admin;
import com.example.demojpa.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/createAdmin")
    public Admin createAdmin(@RequestBody CreateAdminRequest adminRequest) {
        Admin newAdmin = adminRequest.toAdmin();
        adminService.saveAdmin(newAdmin);
        return newAdmin;
    }
}
