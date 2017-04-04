package com.tutorial.spring.annotationbasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedConfigMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBasedConfigBeans.xml");
		TextEditor te = (TextEditor)context.getBean("textEditor");
		te.SpellCheck();
	}

}
