/*
1. Write a Java program to create a new array list, add some colors (string) and 
print out the collection. 
 */

package com.javatraining.day2.arraylist;

import java.util.*;

public class ColourList {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<String>();
		colours.add("Blue");
		colours.add("Orange");
		colours.add("White");
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Black");

		System.out.println("List of Colours : " + colours);
	}
}
