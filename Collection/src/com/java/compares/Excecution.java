package com.java.compares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.java.arraylist.Person;

public class Excecution {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("ofs", 3.2f, 65000.00));
		empList.add(new Employee("infys", 3.2f, 95000.00));
		empList.add(new Employee("tcs", 3.2f, 75000.00));
		empList.add(new Employee("cts", 3.2f, 85000.00));
		
		// here collections sort will work because 
		// i have implemented the comparable interface in the employee object 
		// and overridded the method the compareTo 
		Collections.sort(empList);
		System.out.println(empList);
		
		List<Person> personList = new ArrayList<Person>();

		personList.add(new Person("harshith", 27, "Hindustan University"));
		personList.add(new Person("Giridhar", 26, "Clark university"));
		personList.add(new Person("gnanesh", 28, "Madhanpalli Institute of Technology and Science"));
		System.out.println(personList);
		
//		this does not work because the "Person" Class does not implement the interface comparable;
//		now if you want to compare the person object use the Comparator interface
//		Collections.sort(personList);
		
		// anonymus class
		Comparator<Person> comp = new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.getAge() > p2.getAge() ? 1 : ((p2.getAge() > p1.getAge()) ? -1 : 0);
			}
		};
		

		Collections.sort(personList, comp);
		System.out.println(personList);
		
		// above can be written as below using lambda 
		
	}

}
