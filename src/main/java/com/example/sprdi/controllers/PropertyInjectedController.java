package com.example.sprdi.controllers;

import com.example.sprdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // Tell Spring explicitly to inject and manage an instance of the greetingService
    @Autowired
    @Qualifier("propertyInjectedGreetingService")   // necessary to wire bean to a specific controller
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
