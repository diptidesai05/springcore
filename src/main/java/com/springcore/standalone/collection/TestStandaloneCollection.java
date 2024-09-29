package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollection {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standalone_config.xml");
		Person p=context.getBean("person1", Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
	}

}
