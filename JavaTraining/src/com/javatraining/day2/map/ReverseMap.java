/*
10. Write a Java program to get a reverse order view 
of the keys contained in a given map. 
 */

package com.javatraining.day2.map;

import java.util.Map;
import java.util.TreeMap;

public class ReverseMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();

		myMap.put(122, "Sham");
		myMap.put(101, "Ram");
		myMap.put(102, "Sita");
		myMap.put(103, "Lakshman");
		myMap.put(135, "Arjun");
		myMap.put(107, "Krishna");
		myMap.put(110, "Balram");

		System.out.println("-- Map --");

		System.out.println("Key\tValue");
		for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		System.out.println("\n-- Reverse Map Key Order --");
		System.out.println(myMap.descendingKeySet());

	}

}
