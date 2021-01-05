package com.example.sprdi.controllers;

/* 1) Profiles allow your Spring project to behave differently
*  2) Inversion of Control will now have the capability of a profile
*  I18n is a common abbreviation for internationalisation and will be used as an example for this class */

import com.example.sprdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
