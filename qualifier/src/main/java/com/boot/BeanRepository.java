package com.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRepository {

	@Bean
	public Message getMessage() {
		return new Message("Hey There !");
	}
	
	@Bean(name="john")
	public Receiver getJohnReceiver() {
		return new Receiver("John Doe");
	}
	
	@Bean(name="jane")
	public Receiver getJaneReceiver() {
		return new Receiver("Jane Doe");
	}	
	
}
