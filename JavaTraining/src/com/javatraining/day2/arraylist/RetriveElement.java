/*
4. Write a Java program to retrieve an element (at a specified index) 
from a given array list. 
*/

package com.javatraining.day2.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RetriveElement {

	public static void main(String[] args) {
		
		List<String> colours = new ArrayList<String>();
		
		colours.add("Blue");
		colours.add("Orange");
		colours.add("White");
		colours.add("Red");
		colours.add("Black");
		colours.add(0, "Yellow");

		System.out.println("Colours List : " + colours);
		System.out.println("Element at index 2 : " + colours.get(2));
	}

}
