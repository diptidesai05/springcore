package com.springcore.streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentObj")
@Scope("prototype")
public class Student {
	
	@Value("1245")
	private double studentRollno;
	
	@Value("Gulliable")
	private String studentName;
	
	@Value("#{phoneNosList}")
	private List<Double> phones;
	
	
	public List<Double> getPhones() {
		return phones;
	}
	public void setPhones(List<Double> phones) {
		this.phones = phones;
	}
	public double getStudentRollno() {
		return studentRollno;
	}
	public void setStudentRollno(double studentRollno) {
		this.studentRollno = studentRollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "Student [studentRollno=" + studentRollno + ", studentName=" + studentName + ", phones=" + phones + "]";
	}
	
    
}
