package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com//springcore//ci//construct_config.xml");
		Person personObj = (Person)context.getBean("person1");
		System.out.println(personObj);
		Addition addObj = (Addition)context.getBean("addition1");
		addObj.doSum();
	    /* pls check
	     * exception is coming  if index of a is put as 1 in <constructor-arg> tag and index of b is put as 0 -->
	     * 
	     */
	}
	

}
