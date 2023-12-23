package com.java.misc;

public class Execution {
	
	
	
	public static Animal getAnimalObject() {
		return new Animal(2, true);
	}
	
	public static void main(String[] args) {
		Object o = getAnimalObject();
		Animal a = new Animal(3, true);
		
		System.out.println(a.equals(o));
		
		if(o instanceof Animal) {
			Animal animal = (Animal) o;
			System.out.println(animal.getEyes());
		}
	}	
}
