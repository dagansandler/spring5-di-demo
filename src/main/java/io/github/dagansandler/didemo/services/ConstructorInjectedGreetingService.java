package io.github.dagansandler.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {

    public static final String HELLO_WORLD = "Hello World - Constructor";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }

}
