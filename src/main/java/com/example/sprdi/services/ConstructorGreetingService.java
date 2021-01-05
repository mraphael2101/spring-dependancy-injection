package com.example.sprdi.services;

import org.springframework.stereotype.Service;


// Services and Controllers are the same type of thing i.e. Spring managed components
// By annotating the class like this Spring knows to bring an instance of it into the context
@Service // or Controler
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
