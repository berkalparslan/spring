package com.aberk.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringDenemePropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDenemePropertiesApplication.class);
	
	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringDenemePropertiesApplication.class)){

		ServiceUrl service = applicationContext.getBean(ServiceUrl.class);
		
		LOGGER.info("{}", service.returnServiceUrl());
		}
	}
}