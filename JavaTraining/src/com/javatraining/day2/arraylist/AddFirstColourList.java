/*
3. Write a Java program to insert an element into the array list at the first position.  
 */

package com.javatraining.day2.arraylist;

import java.util.*;

public class AddFirstColourList {
	public static void main(String[] args) {

		List<String> colours = new ArrayList<String>();
		colours.add("Blue");
		colours.add("Orange");
		colours.add("White");
		colours.add("Red");
		colours.add("Black");

		System.out.println("List Before : " + colours);

		colours.add(0, "Yellow");
		System.out.println(colours.get(0) + " colour added at index " + colours.indexOf("Yellow"));

		System.out.println("List After : " + colours);

	}
}
