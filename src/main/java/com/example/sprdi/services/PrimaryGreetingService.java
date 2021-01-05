package com.example.sprdi.services;

/* Concept: a core component which shall be used if no qualifier was marked for a candidate object
*  that is having a dependency injected into it*/


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean";
    }

}
