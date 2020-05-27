package com.springframework.sfgdi.controllers;

import com.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
    System.out.println("Hello world!");
    return greetingService.sayGretting();
}
}
