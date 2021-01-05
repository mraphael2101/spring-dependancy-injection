package com.example.sprdi.controllers;

import com.example.sprdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    // Tells Spring to inject this object (optional for constructor injected controller method)
    //@Autowired
    private final GreetingService greetingService;

    // The qualifier lets Spring know which controller it is for
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() { return greetingService.sayGreeting(); }
}
