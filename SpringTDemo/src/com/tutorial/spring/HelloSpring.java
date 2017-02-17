package com.tutorial.spring;

public class HelloSpring {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void initIt(){
		System.out.println("Init method is going through");
	}
	
	public void destroy(){
		System.out.println("Bean is destroyed");
	}
}
