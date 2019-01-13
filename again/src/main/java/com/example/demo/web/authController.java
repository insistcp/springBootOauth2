package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authController {
    @RequestMapping("/hello")
    public String auth() {
        return "hello";
    }

    @RequestMapping("/say")
    public String say() {
        return "say";
    }
}
