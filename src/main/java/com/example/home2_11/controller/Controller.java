package com.example.home2_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String ShowHelloWorld() {
        return "Hello, world";
    }
}
