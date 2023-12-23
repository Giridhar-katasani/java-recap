package com.inheritance.exercise1;

public class Animal {

	public int height;
	public double weight;
	public String animalType;
	public String bloodType;
	
	public Animal() {
		this.height = 0;
		this.weight = 0.0f;
		this.animalType = "crossReptile";
		this.bloodType = "green";
	}
	
	public Animal(int height, double weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	
	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
}
