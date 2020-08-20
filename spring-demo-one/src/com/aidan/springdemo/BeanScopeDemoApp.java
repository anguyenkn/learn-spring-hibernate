package com.aidan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve the bean from spring container
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the resutls
		System.out.println("\nPointing to same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		// close the context
		context.close();
	}

}
