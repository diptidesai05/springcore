package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfigMain {
	
	@Bean
	public Samosa getSamosa() {
		
		return new Samosa();
	}
	
	@Bean(name= {"stud","tempStud"})
	public Student getStudent() {
		
		Student student=new Student(getSamosa());
		return student;
	}

}
