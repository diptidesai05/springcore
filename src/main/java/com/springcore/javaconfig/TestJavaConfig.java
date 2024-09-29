package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestJavaConfig {

	public static void main(String[] args) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/javaconfig/javaconfig_config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigMain.class);
		
		Student student=context.getBean("tempStud", Student.class);
	    student.marks();
		

	}

}
