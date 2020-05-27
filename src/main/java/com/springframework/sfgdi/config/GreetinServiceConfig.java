package com.springframework.sfgdi.config;

import com.springframework.sfgdi.services.GreetingService;
import com.springframework.sfgdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetinServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(){
        return new GreetingServiceFactory();
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService englishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }



}
