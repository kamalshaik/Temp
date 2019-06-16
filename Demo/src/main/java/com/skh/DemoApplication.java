package com.skh;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
////		DBDetails bean = context.getBean(DBDetails.class);
////		System.out.println(bean);
//
//		int beans = context.getBeanDefinitionCount();
//		System.out.println("beans : " + beans);
		
		
		Properties properties = System.getProperties();
		System.out.println("properties : "+properties);
		String property = properties.getProperty("");
		
		
		

	}

}
