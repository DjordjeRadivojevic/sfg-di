package com.springframework.sfgdi.controllers;

import com.springframework.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectorControllerTest {

    ConstructorInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectorController(new ConstructorGreetingService());
    }

    @Test
    void getgreeting() {
        System.out.println(controller.getGreeting());
    }
}