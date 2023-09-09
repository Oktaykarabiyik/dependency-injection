package com.example.dependency_injection.controllers;

import com.example.dependency_injection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String GetGreeting(){
        return greetingService.sayGreeting();
    }
}
