package com.tutorial.spring.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class SStopEventHandler implements ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		System.out.println("ContextStoppedEvent Recieved");		
	}

}
