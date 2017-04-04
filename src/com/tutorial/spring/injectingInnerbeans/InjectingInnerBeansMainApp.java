package com.tutorial.spring.injectingInnerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingInnerBeansMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansInjInrbeans.xml");
		
		TextEditor te = (TextEditor)context.getBean("textEditor");
		te.spellCheck();
	}

}
