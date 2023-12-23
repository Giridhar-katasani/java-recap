package com.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SearchingAndSorting {
	public static void main(String[] args) {
		List<Character> i = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
//		System.out.println(sc.next());
		
		String name = sc.next();
//		System.out.println(name);
		
		for(char ele: name.toCharArray()) {
			i.add(ele);
		}
		
		int sum = 0;
		
		System.out.println(i);
		
		System.out.println(i.indexOf('i'));
		System.out.println(i.contains('r'));
		Collections.sort(i);
		System.out.println(i);
		
		Person p = new Person("giridhar", 26, "clark");
		Person p1 = new Person("gowtham", 25, "northeastern");
		Person p2 = new Person("karthik", 27, "sacred heart");
		Person p3 = new Person("harshith", 28, "hrudaya kaleyam");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p);
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);

//      with comparator
//		Collections.sort(personList, (personOne, personTwo) -> {
//			return personOne.getAge() > personTwo.getAge() ? -1 : 1;
//		});
//		
//		System.out.println(personList);
		
		// with extends comparable in person class.
		Collections.sort(personList);
		
		System.out.println(personList);
		
		
		List<Integer> integerList = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for (int k = 0; k < 10; k++) {
            int randomNumber = random.nextInt(-4,5); // Generates random number from 0 to 22
            integerList.add(randomNumber);
        }
		
		Collections.sort(integerList);
		Collections.reverseOrder();
		System.out.println(integerList);
	}
}
