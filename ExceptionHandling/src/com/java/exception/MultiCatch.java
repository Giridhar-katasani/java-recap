package com.java.exception;

public class MultiCatch {
	
	public static void main(String[] args) {
		MultiCatch m = new MultiCatch();
		m.case1(0,1);
	}
	
	public void case1(int a, int b) {
		try {
			System.out.println(b/a);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("helo");
		}
	}
}
