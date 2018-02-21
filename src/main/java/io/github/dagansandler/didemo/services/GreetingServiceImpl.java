package io.github.dagansandler.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_DAGAN = "Hello, Dagan!";

    @Override
    public String sayGreeting() {
        return HELLO_DAGAN;
    }
}
