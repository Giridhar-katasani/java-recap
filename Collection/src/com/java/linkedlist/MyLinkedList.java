package com.java.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import com.java.entities.*;

public class MyLinkedList {
	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int start = 0;
		int end = 5;
		while(start <= end) {
			ll.add(start);
			start++;
		}
		
		System.out.println(ll);
		
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		
		int ll2Start = 6;
		int ll2End = 8;
		
		while(ll2Start <= ll2End) {
			ll2.add(ll2Start);
			ll2Start++;
		}
		
		System.out.println(ll2);
		
		// concating two list
		ll.addAll(ll2);
		
		System.out.println(ll);
		
		// complex objects

		Person person1 = new Person("Giridhar", 26, "Clark university");
		Person person2 = new Person("harshith", 27, "Hindustan University");
		Person person3 = new Person("gnanesh", 28, "Madhanpalli Institute of Technology and Science");
	
		LinkedList<Person> PersonList = new LinkedList<Person>();
		PersonList.add(person1);
		PersonList.add(person2);
		PersonList.add(person3);
		
		System.out.println(PersonList);
		
		PersonList.sort((Person per1, Person per2) -> {
		    // Compare ages and return -1, 0, or 1
		    return per1.getAge() > per2.getAge()? -1 : 1;
		});
		
		System.out.println(PersonList);
		
		PersonList.sort((Person per, Person per2) -> {
			return Integer.compare(per.getAge(), per2.getAge());
		});
		
		System.out.println(PersonList);
		
		// good for manipulating the data kind of removal
		Iterator<Person> personIterator = PersonList.iterator();
		while(personIterator.hasNext()) {
			if(personIterator.next().getAge() == 30) {
				personIterator.remove();
			}
		}
		
		PersonList.removeIf(per -> per.getAge() == 28);
		System.out.println(PersonList);
	}
}
