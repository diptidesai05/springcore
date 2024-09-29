package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com//springcore//autowire//autowire_config.xml");
		Employee emp=context.getBean("employee1", Employee.class);
		System.out.println(emp);

	}

}
