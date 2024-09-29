package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpel {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/spel_config.xml");
		Demo d = context.getBean("demoObj", Demo.class);
		System.out.println(d);

	}

}
