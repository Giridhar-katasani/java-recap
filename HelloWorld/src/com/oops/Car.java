package com.oops;

public class Car {

	// which is blue print, help us to depict the real world entities
	private String carName;
	private String model;
	private String seated;
	private double price;
	private int number;
	
	public Car() {
	}
	
	public Car(String carName, String model, String seated, double price, int number) {
		this.carName = carName;
		this.model = model;
		this.seated = seated;
		this.price = price;
		this.number = number;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSeated() {
		return seated;
	}

	public void setSeated(String seated) {
		this.seated = seated;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", model=" + model + ", seated=" + seated + ", price=" + price + ", number="
				+ number + "]";
	}
	
}
