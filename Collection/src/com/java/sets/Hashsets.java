package com.java.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashsets {

	public static void main(String[] args) {
		
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(1);
		integerSet.add(2);
		integerSet.add(3);
		
		// set does not allows duplicates
		integerSet.add(3);
		
		System.out.println(integerSet);
		
		Set<Integer> integerSet1 = new HashSet<Integer>();
		integerSet1.add(5);
		integerSet1.add(5);
		integerSet1.add(7);
		integerSet1.add(6);

		integerSet.addAll(integerSet1);
		System.out.println(integerSet);
		
		// we tree set because it maintains the insertion order.
		// where as hash set will not maintian hashset not maintain order
		Set<Integer> numbersTreeSet = new TreeSet();
		numbersTreeSet.add(1);
		numbersTreeSet.add(3);
		numbersTreeSet.add(2);
		numbersTreeSet.add(5);
		
		System.out.println(numbersTreeSet);
	}
}
