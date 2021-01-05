package com.example.sprdi.controllers;

import com.example.sprdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// The least prefered method. Avoid this approach for dependency injection without Spring

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreating() {
        System.out.println(controller.getGreeting());
    }

}