package com.inheritance.main;

import com.inheritance.exercise1.Animal;
import com.inheritance.exercise1_2.Reptile;

public class InheritanceMain {

	public static void main(String[] args) {
		Animal a = new Reptile();
		System.out.println(a.height);
		Reptile r = new Reptile();
	}
}
