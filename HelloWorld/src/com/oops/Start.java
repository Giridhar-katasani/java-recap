package com.oops;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		System.out.println(car.getModel());// null
		
		car.setCarName("tesla");
		car.setModel("model x");
		car.setPrice(10000.01);
		car.setSeated("yes");
		car.setNumber(7469);
		
		System.out.println(car.getCarName());
		System.out.println(car.getModel());
		System.out.println(car.getNumber());
		System.out.println(car.getPrice());
		System.out.println(car.getSeated());
		
		Car mercedesCar = new Car("meercedes", "model s", "yes", 10000.01, 7469);
		
		System.out.println(mercedesCar.toString());
		
		//concept static 
				
		AllAboutStatic a = new AllAboutStatic("gseries", 5.0);
		
		System.out.println(a.getVersion());
		System.out.println(a.getClass());
		System.out.println(a.toString());
		
		AllAboutStatic a1 = new AllAboutStatic("gseries", 5.1d);
		System.out.println(a1.toString());
		
		//concept static method
		// can access with class name it self no need to have the instance
		AllAboutStatic.showBrand();
		// can also be access by instance
		AllAboutStatic a2 = new AllAboutStatic("m series", 5.9d);
		a2.showBrand();
	}
}
