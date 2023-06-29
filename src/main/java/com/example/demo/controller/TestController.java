package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String getMessage() {
        return "Hello world!";
    }

    @GetMapping("/other")
    public String getOtherMessage() {
        return "Hello Azure";
    }
}
