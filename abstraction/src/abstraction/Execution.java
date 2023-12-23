package abstraction;

public class Execution {
	public static void main(String[] args) {
		Vehicle v = new Bike();
		v.run();
		
		Bike b = new Bike();
		b.run();
		b.start();// 
		b.studentDiscount();// static method from the vehicle class
	}
}
