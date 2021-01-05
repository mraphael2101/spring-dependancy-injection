package com.example.sprdi;

import com.example.sprdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprDiApplication {

	public static void main(String[] args) {

		// The run method returns back an application context
		ApplicationContext appContext = SpringApplication.run(SprDiApplication.class, args);

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) appContext.getBean("propertyInjectedController");
		System.out.println("------- Property");
		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController =
				(SetterInjectedController) appContext.getBean("setterInjectedController");
		System.out.println("------- Setter");
		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constInjectCont =
				(ConstructorInjectedController) appContext.getBean("constructorInjectedController");
		System.out.println("------- Constructor");
		System.out.println(constInjectCont.getGreeting());

		// Create a new instance of a class and add it as a bean into the context
		MyController myController = (MyController) appContext.getBean("myController");
		System.out.println("------- Primary Bean");
		System.out.println(myController.sayHello());	// Run a method from the Controller via the app context

		System.out.println("------- Default Profile allows Spring to determine which bean to add to Context");
		I18nController i18nController = (I18nController) appContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());

	}

}
