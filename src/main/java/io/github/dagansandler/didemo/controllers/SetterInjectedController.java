package io.github.dagansandler.didemo.controllers;

import io.github.dagansandler.didemo.services.GreetingService;
import io.github.dagansandler.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
