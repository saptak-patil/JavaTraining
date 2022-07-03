package com.javatraining.day2.map;

/*
9. Write a Java program to get the first (lowest) key and 
the last (highest) key currently in a map
 */

import java.util.Map;
import java.util.TreeMap;

public class Map2 {
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

		System.out.println("\nFirst Key (Lowest) :" + myMap.firstKey());
		System.out.println("\nLast Key (Highest) :" + myMap.lastKey());
	}
}
