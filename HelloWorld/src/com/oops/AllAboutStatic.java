package com.oops;

public class AllAboutStatic {
	
	// all static properties, blocks, method are stored in class memory
	
	// static block
	// always executes first
	static {
		System.out.println("hello world");
	}

	// static variable
	private static String brand = "Samsung";
	
	// static method
	public static void showBrand() {
		System.out.print(brand);
	}
	
	private String model;
	private double version;
	
	public AllAboutStatic(String model, double d) {
		super();
		this.model = model;
		this.version = d;
		System.out.println("hello world from constructor");
	}
	
	public String getModel() {
		return model;
	}
	
	public double getVersion() {
		return version;
	}
	
	@Override
	public String toString() {
		return "AllAboutStatic [brand = " + brand + ", model=" + model + ", version=" + version + "]";
	}
}
