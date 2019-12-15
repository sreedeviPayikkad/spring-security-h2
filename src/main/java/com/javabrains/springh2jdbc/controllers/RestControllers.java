package com.javabrains.springh2jdbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestControllers {

    @GetMapping("/")
    public String welcomeAllUsers() {
        return "<h1>Home page</h1>";
    }

    @GetMapping("/user")
    public String welcomeUser() {
        return "<h1>User page</h1>";
    }

    @GetMapping("/admin")
    public String welcomeAdmin() {
        return "<h1>Admin page</h1>";
    }
}
