package io.github.dagansandler.didemo.controllers;

import io.github.dagansandler.didemo.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;

    @BeforeEach
    public void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.greetingService = new PropertyInjectedGreetingService();
    }

    @Test
    public void testGreeting() {
        assertEquals(PropertyInjectedGreetingService.HELLO_WORLD, controller.getGreeting());
    }

}
