package com.java.inheritance;

public class Dog extends Animal {
	private int teeth = 28;
	
	public void walk() {
		System.out.println("dog walking");
	}
	
	public void eat() {
		System.out.println("dog eating"+ teeth);
	}
	
	public void walk(int speed) {
		System.out.println("dog walking"+ speed);
	}
}
