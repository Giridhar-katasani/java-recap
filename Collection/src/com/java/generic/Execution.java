package com.java.generic;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> b = new Box<Integer>();
		b.setValue(8);
		System.out.println(b.getValue());
		
		// define the type at compile time 
		// you can put the string and integer both 
		// this why generic help to provide type safety 
		// if object <String> can't add the object of type Integer
		Box<String> s = new Box<String>();
		s.setValue("helo");
		System.out.println(s.getValue());
	}

}
