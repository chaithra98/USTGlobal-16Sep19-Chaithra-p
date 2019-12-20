package com.ustglobal.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ORMconfig {
	@Bean
public LocalEntityManagerFactoryBean getBean() {
	LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
	bean.setPersistenceUnitName("Test");
	return bean;
}
}
