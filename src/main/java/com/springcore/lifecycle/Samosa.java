package com.springcore.lifecycle;

public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		System.out.println("inside setPrice of Samosa");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    //public void init() {
	public void hello() {	
    	
    	System.out.println("inside init method hello");
    }
    
    //public void destroy() {
    public void bye() {
    	
    	System.out.println("inside destroy method bye ");
    }
}
