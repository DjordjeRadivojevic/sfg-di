package com.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGretting() {
        return "Hello World-Property";
    }
}
