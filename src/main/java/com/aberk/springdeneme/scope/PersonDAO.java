package com.aberk.springdeneme.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
// @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PersonDAO {

	@Autowired
	JDBCConnection jdbcConnection;

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public JDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info(" Post Constructed ");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info(" Pre Destroyed ");
	}
	
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = jdbcConnection.getDataFromDB();
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
	
}
