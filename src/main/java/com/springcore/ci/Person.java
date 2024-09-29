package com.springcore.ci;

import java.util.List;

public class Person {
	
	private String name;
	private int personid;
	private Certi cer;
	private List<String> list;
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Person(String name, int personid, Certi cer, List list) {
		super();
		this.name = name;
		this.personid = personid;
		this.cer=cer;
		this.list=list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personid=" + personid + ", cer=" + cer + ", list=" + list + "]";
	}
}

