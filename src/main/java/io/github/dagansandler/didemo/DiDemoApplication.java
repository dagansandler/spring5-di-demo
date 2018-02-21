package io.github.dagansandler.didemo;

import io.github.dagansandler.didemo.controllers.ConstructorInjectedController;
import io.github.dagansandler.didemo.controllers.MyController;
import io.github.dagansandler.didemo.controllers.PropertyInjectedController;
import io.github.dagansandler.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
