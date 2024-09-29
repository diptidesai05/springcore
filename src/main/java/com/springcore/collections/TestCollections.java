package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//springcore//collections//collections_config.xml");
		Employee emp = (Employee) context.getBean("employee1");
		System.out.println("Name ="+emp.getName());
		System.out.println("Phone ="+emp.getPhones());
		System.out.println("addresses "+emp.getAddresses());
		System.out.println("courses "+emp.getCourses());
		System.out.println("crenditals "+emp.getCrenditals());

	}

}
