package com.oops.inheritance;

public class StartInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.walk();
		
		Dog d = new Dog();
		d.bark();
		d.walk();
		
		Animal m = new Dog();
//we cannot access the properties of dog class if the object is created with the type of animal
//		m.bark();
//		Dog k = new Animal();
	}
}
