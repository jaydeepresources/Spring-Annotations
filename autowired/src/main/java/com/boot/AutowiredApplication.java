package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutowiredApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutowiredApplication.class, args);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanRepository.class);
		Message m = ctx.getBean(Message.class);
		System.out.println(m);
	}

}
