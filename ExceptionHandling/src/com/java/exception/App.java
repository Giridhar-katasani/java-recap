package com.java.exception;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App a = new App();
		a.case1(1, 1);
		a.case2(0, 0);
	}

	public void case1(int x, int y) {
		if(y != 0) {
			System.out.println(x/y);
		} else {
			System.out.println("the value of y is not zero");
		}
	}
	
	public void case2(int x, int y) {
		try {
			System.out.println(x/y);
		} catch(Exception e) {			
			System.out.println(x/y);
		}
	}
}
