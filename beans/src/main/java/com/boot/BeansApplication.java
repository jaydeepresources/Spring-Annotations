package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansApplication.class, args);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanRepository.class);
		Message m = ctx.getBean(Message.class);
		System.out.println(m);
		   
	}

}
