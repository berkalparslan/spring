package com.aberk.componentscan;

import org.springframework.stereotype.Component;

@Component
// @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJDBCConnection {
	
	public ComponentJDBCConnection() {
		System.out.println("JDBC Connection");
	}
}
