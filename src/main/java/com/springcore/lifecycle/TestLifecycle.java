package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com//springcore//lifecycle//lifecylce_config.xml");
		//Samosa s1 = (Samosa)context.getBean("samosa1");
		//System.out.println(s1);
		// register shutdown hook
		context.registerShutdownHook();
		//Pepsi p = (Pepsi)context.getBean("pepsi1");
		//System.out.println(p);
		Pizza pz =(Pizza)context.getBean("pizza1");
		System.out.println(pz);

	}

}
