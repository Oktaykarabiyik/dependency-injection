package com.example.dependency_injection;

import com.example.dependency_injection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

       ApplicationContext ctx= SpringApplication.run(Application.class, args);
       //I didnt create object, I wanted an instance of the object


        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println("------ i18nController");
        System.out.println(i18nController.sayGreeting());

        MyController myController=(MyController) ctx.getBean("myController");

        System.out.println("--------  Primary Bean");
        System.out.println(myController.GetGreeting());

        System.out.println("--------  Property");

        PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------- Setter");

        SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------ Constructor");

        ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());





    }

}
