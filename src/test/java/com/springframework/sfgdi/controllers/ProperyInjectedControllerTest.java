package com.springframework.sfgdi.controllers;

import com.springframework.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProperyInjectedControllerTest {

    ProperyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ProperyInjectedController();

        controller.greetingService=new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}