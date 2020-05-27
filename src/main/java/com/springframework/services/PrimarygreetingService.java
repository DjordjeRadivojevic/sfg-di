package com.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimarygreetingService implements GreetingService{
    @Override
    public String sayGretting() {
        return "Hello World- from PRIMARY bean";
    }
}
