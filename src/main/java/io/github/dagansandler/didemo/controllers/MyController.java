package io.github.dagansandler.didemo.controllers;

import io.github.dagansandler.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController implements GreetingController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
