package io.github.dagansandler.didemo.config;

import io.github.dagansandler.didemo.services.GreetingRepository;
import io.github.dagansandler.didemo.services.GreetingService;
import io.github.dagansandler.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

  @Bean
  GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
    return new GreetingServiceFactory(greetingRepository);
  }

  @Bean
  @Primary
  @Profile("de")
  GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreetingService("de");
  }

  @Bean
  @Primary
  @Profile({"default", "en"})
  GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreetingService("en");
  }

  @Bean
  @Primary
  @Profile("es")
  GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreetingService("es");
  }
}
