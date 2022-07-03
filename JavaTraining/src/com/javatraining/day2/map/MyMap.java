/*
8. Write a Java program to get a key-value mapping associated with 
the greatest key and the least key in a map.
 */

package com.javatraining.day2.map;

import java.util.Map;
import java.util.TreeMap;

public class MyMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();

		myMap.put(101, "Ram");
		myMap.put(122, "Sham");
		myMap.put(102, "Sita");
		myMap.put(103, "Lakshman");
		myMap.put(135, "Arjun");
		myMap.put(107, "Krishna");
		myMap.put(110, "Balram");
		myMap.put(105, null); // will accept null value with valid key
//		myMap.put(null, null); // will throw null pointer exception if executed

		System.out.println("-- Map --");

		System.out.println("Key\tValue");
		for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		System.out.println("\nLeast Key in Map :" + myMap.firstEntry());
		System.out.println("\nGreatest Key in Map :" + myMap.lastEntry());
		
	}
}
