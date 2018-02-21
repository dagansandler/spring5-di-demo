package io.github.dagansandler.didemo;

import io.github.dagansandler.didemo.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Nobody expects the Spanish Greeting Service";
    }

}
