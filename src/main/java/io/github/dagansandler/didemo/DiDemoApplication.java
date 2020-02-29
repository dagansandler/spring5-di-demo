package io.github.dagansandler.didemo;

import io.github.dagansandler.didemo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.getGreeting());

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("------- Primary Bean");
        System.out.println(myController.getGreeting());

        System.out.println("------- Property");
        System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
        System.out.println("------- Setter");
        System.out.println(ctx.getBean(SetterInjectedController.class).getGreeting());
        System.out.println("------- Constructor");
        System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());

    }
}
