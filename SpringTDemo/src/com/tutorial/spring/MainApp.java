package com.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String [] args){
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring obj = (HelloSpring) context.getBean("helloSpring1");
		//obj.setMessage("Hi this message is send from MainApp\n");
		System.out.println(obj.getMessage());
		context.registerShutdownHook();
	
	}
}
