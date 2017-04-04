package com.tutorial.spring.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingMainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("EventHandlerBeans.xml");
		
		//Raise a start event
		context.start();
		Student st = (Student)context.getBean("student");
		st.getName();
		st.getAge();
		//Raise a stop event
		context.stop();
	}

}
