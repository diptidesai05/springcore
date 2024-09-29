package com.springcore.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireAnnotation {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com//springcore//autowireannotation//autowireannotation_config.xml");
		Employee emp=context.getBean("employee1", Employee.class);
		System.out.println(emp);

	}

}
