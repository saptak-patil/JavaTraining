/*
7. Write a Java program to search an element in a array list.
 */

package com.javatraining.day2.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ElementSearch {
	public static void main(String[] args) {
		List<String> colours = new ArrayList<String>();
		colours.add("Orange");
		colours.add("White");
		colours.add("Red");
		colours.add("Blue");
		colours.add("Black");

		System.out.println("List : " + colours);

		if (colours.contains("Blue"))
			System.out.println("Blue colour found at index " + colours.indexOf("Blue"));
		else
			System.out.println("Colour blue not found in List");
	}
}
