package com.springcore.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.collection.Person;

public class TestStreotype {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/streotype/streotype_config.xml");
		Student student=context.getBean("studentObj", Student.class);
		System.out.println(student);
		System.out.println("Hashcode of Student class");
		System.out.println(student.hashCode());
		Student student1=context.getBean("studentObj", Student.class);
		System.out.println("Hashcode of Student class");
		System.out.println(student1.hashCode());
		
		Teacher teacher=context.getBean("teacher", Teacher.class);
		System.out.println(teacher);
		System.out.println("Hashcode of teacher");
		System.out.println(teacher.hashCode());
		
		Teacher teacher1=context.getBean("teacher", Teacher.class);
		System.out.println(teacher1);
		System.out.println("Hashcode of teacher");
		System.out.println(teacher1.hashCode());
		
		
		

	}

}
