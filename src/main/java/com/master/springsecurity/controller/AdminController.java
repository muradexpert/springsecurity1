package com.master.springsecurity.controller;

import com.master.springsecurity.entity.User;
import com.master.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/test")
public String testAdmin(){
    return "This test is for Admin...";
}

@PostMapping("/addUser")
public String addUser(@RequestBody User user){
         user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User added...";

}
}
