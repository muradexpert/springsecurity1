package com.master.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unregistered")
public class UnregisteredUsers {

    @GetMapping("/test")
    public String UnTest(){
        return "This uis for Unregistered Users...";
    }

}
