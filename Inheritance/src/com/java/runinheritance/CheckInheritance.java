package com.java.runinheritance;

import com.java.inheritance.Animal;
import com.java.inheritance.Dog;

public class CheckInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a = new Animal();

//		a.walk();
		
		// though you create object of Dog but you are pointer 
//		type is animal so you access only the features of Animal not the dog
//		Animal animal = new Dog();
//		animal.eat();// 
		
//		Dog d = new Animal()
		
//		Animal animalOne = new Animal();
//		animalOne.eat(); // animal eat
		
		Animal animalTwo = new Dog();
//		animalTwo.walk(5);// throws compiler error because the method walk(5) with parameter is not in the Animal class
		animalTwo.eat();// print
		
//		Dog dog1 = new Dog();
//		dog1.tail();
		
		//dog can not hold animal
//		Dog dog2 = new Animal();
	}

}
