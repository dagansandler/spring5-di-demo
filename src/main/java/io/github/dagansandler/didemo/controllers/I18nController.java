package io.github.dagansandler.didemo.controllers;


import io.github.dagansandler.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController implements GreetingController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
