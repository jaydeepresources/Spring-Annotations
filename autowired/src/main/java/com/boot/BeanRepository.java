package com.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRepository {

	@Bean
	public Message getMessage() {
		return new Message("Hey There !");
	}
	
	@Bean
	public Receiver getReceiver() {
		return new Receiver("John Doe");
	}
	
}