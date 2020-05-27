package com.springframework.sfgdi;

import com.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springframework.services","com.springframework.sfgdi"})
public class SfgDiApplication {

    public static void main(String[] args) {

       ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController = (I18nController)ctx.getBean("i18nController");
        System.out.println("");
        System.out.println(i18nController.sayGreeting());


        MyController myController=(MyController) ctx.getBean("myController");
        String greeting= myController.sayHello();
        System.out.println("Primary bean");
        System.out.println(myController.sayHello());

        System.out.println("-----------Property");

        ProperyInjectedController properyInjectedController = (ProperyInjectedController)ctx.getBean("properyInjectedController");
        System.out.println(properyInjectedController.getGreeting());

        System.out.println("-------------Settet");
        SetterInjectionController setterInjectionController = (SetterInjectionController)ctx.getBean("setterInjectionController");
        System.out.println(setterInjectionController.getGreeting());

        System.out.println("---------Constructor");
        ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController)ctx.getBean("constructorInjectorController");
        System.out.println(constructorInjectorController.getGreeting());
    }

}
