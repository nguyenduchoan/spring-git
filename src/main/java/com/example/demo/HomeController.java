package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    @GetMapping
    public String helloWork() {
        return "Hello Work";
    }

    @GetMapping("/home")
    public String home() {
        return "HomeController";
    }
}
