package com.aberk.xmlContextApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringXMLContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			// [xmlJdbcConnection, xmlPersonDAO]

			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
		}
	}
}