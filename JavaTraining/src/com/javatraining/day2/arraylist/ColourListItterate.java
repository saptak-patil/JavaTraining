/*
2. Write a Java program to iterate through all elements in a array list.  
 */

package com.javatraining.day2.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColourListItterate {
	public static void main(String[] args) {

		List<String> colours = new ArrayList<String>();
		colours.add("Blue");
		colours.add("Orange");
		colours.add("White");
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Black");

		Iterator<String> it = colours.iterator();

		System.out.println("--- Colours ---");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		;

	}
}
