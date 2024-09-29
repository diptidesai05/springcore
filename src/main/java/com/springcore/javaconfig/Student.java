package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("student")
public class Student {
	
	
	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	void marks() {
		 this.samosa.getPrice();
		 System.out.println("Good marks");
	 }

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
     
}
