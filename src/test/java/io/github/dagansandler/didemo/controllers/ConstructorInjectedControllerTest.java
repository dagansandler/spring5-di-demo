package io.github.dagansandler.didemo.controllers;

import io.github.dagansandler.didemo.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    public void setUp() {
        this.controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    public void testGreeting() {
        assertEquals(ConstructorInjectedGreetingService.HELLO_WORLD, controller.getGreeting());
    }

}
