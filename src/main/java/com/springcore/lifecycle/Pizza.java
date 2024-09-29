package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza(double price) {
		super();
		this.price = price;
	}
	
	@PostConstruct		
	public void init() {	
		
		System.out.println("init method for Pizza using annotation");
	}
	@PreDestroy
	public void destroy() {
		
		System.out.println("destroy method for Pizza using annotation");
	}

}
