package Interfaces;

public class Execution implements Printable{
	
	public void show() {
		System.out.println("from show");
	}
	
	public void print() {
		System.out.println("from print");
	}
	
	public static void main(String[] args) {
		Printable p = new Execution();
		p.print();
		p.show();
		
		Showable s = new Execution();
		s.show();
		//s.print();
	}
}
