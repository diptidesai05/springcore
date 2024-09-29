package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoObj")
public class Demo {
	
	@Value("#{12-9}")
	private int x;
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(45)}")
	private int z;
	
	@Value("#{T(java.lang.Math).E}")
    private double w;
	
	@Value("#{new java.lang.String('gotala')}")
	private String name;
	
	@Value("#{ 8<18 }")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", w=" + w + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	

}
