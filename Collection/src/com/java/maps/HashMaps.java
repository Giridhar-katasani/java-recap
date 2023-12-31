package com.java.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		phoneBook.put("harry", 9892739);
		phoneBook.put("cushion", 38744848);
		phoneBook.put("jenny", 873638);
		
		// access val with key
		System.out.println(phoneBook.get("harry"));
		System.out.println(phoneBook.get("cushion"));
		
		/* PUT works in way that if the key does not exists it will add the new data*/
		// put
		phoneBook.put("hello", 94747);
		
		/* replace works if a key does not exists it will not add new pair */
		// replace
		phoneBook.replace("ana", 9387);
		
		System.out.println(phoneBook);
	}
}
