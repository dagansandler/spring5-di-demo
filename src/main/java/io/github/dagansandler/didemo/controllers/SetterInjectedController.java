package io.github.dagansandler.didemo.controllers;

import io.github.dagansandler.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController implements GreetingController {

    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
