package abstraction;

public abstract class Vehicle {
	
	/*imp points
	 we cannot instantiate the abstract methods.
	 abstract method should start with abstract keywords.
	 abstract class can have the "final" classes which will help to not change their definition 
	 in the subclass.
	 if any normal class extends to abstract class, the subclass must be implement the method.
	 abstract class can have both abstract and normal methods.
	 */
	
	
	public abstract void run();
	
	public static int studentDiscount() {
		return 5;
	}
	
	public void brand() {
		System.out.println("the brand is the TATA");
	}
}
