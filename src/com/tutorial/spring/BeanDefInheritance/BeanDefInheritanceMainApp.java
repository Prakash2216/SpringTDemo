package com.tutorial.spring.BeanDefInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefInheritanceMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansBDInhr.xml");
		
		/*HelloParentBean obj = (HelloParentBean)context.getBean("beanTemplate");
		obj.getMessage1();
		obj.getMessage2();*/
		
		HelloChildBean cobj = (HelloChildBean)context.getBean("helloChildbean");
		cobj.getMessage1();
		cobj.getMessage2();
		cobj.getMessage3();
	}

}
