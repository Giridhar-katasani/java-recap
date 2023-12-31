package com.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BasicOperations {
 	
	public List<Integer> addIntegers(List<Integer> i, int start, int end) {
		while(start <= end) {
			i.add(start);
			start++;
		}
		return i;
	}
	
	public static void main(String[] args) {
//		private List<Integer> i = new ArrayList<Integer>();
		List<Integer> i = new ArrayList<Integer>();
		
		BasicOperations bo = new BasicOperations();
		
		List<Integer> intArray = bo.addIntegers(i, 1, 5);
		System.out.println(intArray);
		// type check
		System.out.println(intArray.getClass()== ArrayList.class);
		
		// adding element at index 2
		i.add(2,6);
		System.out.println(i);
		
		// remove element at specific index 3
		i.remove(3);
		System.out.println(i);
		
		//update an element
		i.set(2, 3);
		System.out.println(i);
		
		// iterate elements in a loop
		for(int ele:i)
			System.out.println(ele);
		
		Iterator<Integer> listIterator = i.iterator();
		
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		
		// concat both list
		List<Integer> newList = new ArrayList<>();
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(7);
        
        i.addAll(newList);
        
        // sublist
        List<Integer> subList = i.subList(1, 4);
        System.out.println(subList);
        System.out.println(i);
        
        System.out.println(i);
        System.out.println(11);
        
        i.removeIf(newList::contains);
        System.out.println(i);
        
        
        // exception handling in arraylist
        try {
        	i.get(1);
        	int index = i.indexOf(9);
        	if (index != -1) {
                System.out.println( 9 + " found at index " + index);
            } else {
                throw new NoSuchElementException("Element not found in the list");
            }
        } catch (IndexOutOfBoundsException e) {
        	System.err.println(e.getMessage());
        } catch (NoSuchElementException x) {
        	System.err.println(x.getMessage());
        }
        
        // conversion
        System.out.println(i.toArray());
	}
}
