package com.example.zajeciasecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String publicEndpoint(){
        return "index";
    }

    @GetMapping("/secured")
    public String securedEndpoint(){
        return "secured";
    }
}
