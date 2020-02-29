package io.github.dagansandler.didemo.controllers;

import io.github.dagansandler.didemo.services.SetterInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @BeforeEach
    public void setUp() {
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new SetterInjectedGreetingService());
    }

    @Test
    public void testGreeting() {
        assertEquals(SetterInjectedGreetingService.HELLO_WORLD, controller.getGreeting());
    }

}
