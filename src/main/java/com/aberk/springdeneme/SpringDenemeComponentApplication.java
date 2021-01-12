package com.aberk.springdeneme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.aberk.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.aberk.componentscan")
public class SpringDenemeComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDenemeComponentApplication.class);
	
	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringDenemeComponentApplication.class)){

		ComponentDAO personDAO = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", personDAO);
		}
	}
}