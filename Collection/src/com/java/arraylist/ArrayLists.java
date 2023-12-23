package com.java.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
	
	public static void main(String[] args) {
		Person person1 = new Person("Giridhar", 26, "Clark university");
		Person person2 = new Person("harshith", 27, "Hindustan University");
		Person person3 = new Person("gnanesh", 28, "Madhanpalli Institute of Technology and Science");
//		Person person4 = new Person("rakesh", 29, "ghs");
		
		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
//		personList.add(person4);
		
		// reversing a list
//		Collections.sort(personList, (p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
//		for(Person p : personList) {
//			System.out.println(p);
//		}
		
		Collections.sort(personList, (p1,p2) ->  {
			for(Person p : personList) {
				System.out.println(p+""+"helo");
			}
			System.out.println(p1.getAge()+" "+p2.getAge());
			return Integer.compare(p1.getAge(), p2.getAge());
		});
		
		
		
		System.out.println(personList);
		
		Collections.sort(personList, (p1, p2) -> {
			return p1.getAge() > p2.getAge() ? 1 : ((p2.getAge() > p1.getAge()) ? -1 : 0); 
		});
		
		for(Person p : personList) {
			System.out.println(p);
		}
		
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(11);
		list.add(1, 10);
		for(Object i:list) {
			System.out.println(i);
		}
		
		list.sort(null);
//		 old technique
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
