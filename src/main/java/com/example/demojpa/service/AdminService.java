package com.example.demojpa.service;

import com.example.demojpa.models.Admin;
import com.example.demojpa.respository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;
    public void saveAdmin(Admin admin) {
        adminRepository.save(admin);
    }
}
