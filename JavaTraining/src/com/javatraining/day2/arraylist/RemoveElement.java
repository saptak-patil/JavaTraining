/*
6. Write a Java program to remove the third element from a array list.
 */
package com.javatraining.day2.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	public static void main(String[] args) {
		List<String> colours = new ArrayList<String>();
		colours.add("Blue");
		colours.add("Orange");
		colours.add("White");
		colours.add("Red");
		colours.add("Black");

		System.out.println("List Before : " + colours);

		colours.remove(3-1);

		System.out.println("List After : " + colours);

	}

}
