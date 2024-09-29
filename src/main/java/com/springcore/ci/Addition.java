package com.springcore.ci;

public class Addition {
	
	private int a;
	private int b;
	

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("in construct int, int ");
	}
	
	
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("in construct double, double ");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("in construct string, string ");
	}
	
	
	public void doSum() {
		System.out.println("a= "+this.a);
		System.out.println("b= "+this.b);
		System.out.println("Sum = "+(this.a + this.b));
	}
	

}
