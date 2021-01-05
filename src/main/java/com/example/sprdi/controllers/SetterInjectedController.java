package com.example.sprdi.controllers;

import com.example.sprdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Dependency injection example without Spring

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    // Tell Spring explicitly that we want the setter to be used to inject and manage an instance of the greetingService
    @Autowired
    @Qualifier("setterInjectedGreetingService") // necessary to wire bean to a specific controller
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
