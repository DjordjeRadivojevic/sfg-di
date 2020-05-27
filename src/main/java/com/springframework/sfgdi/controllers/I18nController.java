package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

//    @Qualifier("i18nService") in () before parameter
    public I18nController( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGretting();
    }
}
