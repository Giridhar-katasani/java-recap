package com.java.inheritance;

public class Animal {
	
	private final int teeth;
	
	public Animal() {
		eat();
		this.teeth = 9;
	}
	
	private int legs = 4;
	
	public void walk() {
		System.out.println("animal walking"+legs);
	}
	
	public void eat() {
		System.out.println("animal eating"+ teeth);
	}
	
	public void tail() {
		System.out.println("not a mandatory");
	}
}
