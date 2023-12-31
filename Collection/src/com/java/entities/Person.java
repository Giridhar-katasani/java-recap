package com.java.entities;

import java.util.Comparator;

public class Person implements Comparable<Person>  {

	private String name;
	private int age;
	private String university;
	public String getName() {
		return name;
	}
	
	public Person(String name, int age, String university) {
		super();
		this.name = name;
		this.age = age;
		this.university = university;
	}

	public int getAge() {
		return age;
	}

	public String getUniversity() {
		return university;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", university=" + university + "]";
	}
	

	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		System.out.println(this.age+" "+o.age);
		return Person.compare(this.age, o.age);
	}
//	
	public static int compare(int age_one, int age_two) {
//		System.out.println(age_one+" "+age_two);
		return age_one > age_two ? 1 : -1;	
	}
	
	
}
