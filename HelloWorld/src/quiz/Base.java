package quiz;

class Animal {
	public int legs = 4;
	public int eyes = 3;
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void walk() {
		System.out.println("Animal is walking");
	}
	
	public void bark() {
		System.out.println("Animal barks");
	}
}

class Dog extends Animal{
	public int tail = 1;

	public void bark() {
		System.out.println("Dog barking");
	}
}

class Cat extends Animal {
	public int tail = 2;
	
	public void bark() {
		System.out.println("cat sound meaow");
	}
}

class leopard extends Cat {
	public int tail = 3;
	
	public void bark() {
		System.out.println("lepords sounds Great");
	}
}

public class Base {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.bark();// dog barks
		Dog d = new Dog();
		d.bark();// dog barks
		Animal animal = new Animal();
		animal.bark();// animal barks
//		System.out.println();
//		((Cat) a).walk();
		Cat c = new Cat();
		((leopard) c).bark();
	}
}