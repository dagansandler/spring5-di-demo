package io.github.dagansandler.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {

    public static final String HELLO_WORLD = "Hello World - Setter";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }

}
