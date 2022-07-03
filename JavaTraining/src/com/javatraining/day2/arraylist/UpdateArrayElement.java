/*
5. Write a Java program to update specific array element by given element.
 */

package com.javatraining.day2.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayElement {

	public static void main(String[] args) {
		List<String> colours = new ArrayList<String>();

		colours.add("Blue");
		colours.add("Orange");
		colours.add("White");
		colours.add("Red");
		colours.add("Black");
		colours.add("Yellow");

		System.out.println("Colours List : " + colours);

		System.out.println("\nUpdating Element RoyalBlue in place of Red....");
		colours.set(colours.indexOf("Red"), "Royal Blue");

		System.out.println("\nColours List : " + colours);

	}

}
