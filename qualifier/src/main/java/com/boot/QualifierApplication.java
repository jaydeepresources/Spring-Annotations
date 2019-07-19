package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class QualifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierApplication.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanRepository.class);
		
		Message m = ctx.getBean(Message.class);
		System.out.println(m);
	}

}