/*
Write A arraylist program using these methods

size()    			Returns the length of the arraylist.
sort()    			Sort the arraylist elements.
clone()    			Creates a new arraylist with the same element, size, and capacity.
contains()    		Searches the arraylist for the specified element and returns a boolean result.
ensureCapacity()    Specifies the total element the arraylist can contain.
isEmpty()    		Checks if the arraylist is empty.
indexOf()    		Searches a specified element in an arraylist and returns the index of the element.
 */

package com.javatraining.day1.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Ram");
		myList.add("Bhim");
		myList.add("Krishna");
		myList.add("Sita");
		myList.add("Ira");
		myList.add("Radha");

		System.out.println("Array List : " + myList.toString());

		System.out.println("Size : " + myList.size());

		Collections.sort(myList);
		System.out.println("\nSorted List : " + myList);

		ArrayList<String> newList = new ArrayList<String>();
		newList = (ArrayList<String>) myList.clone();
		System.out.println("\nCloned List : " + newList);

		System.out.println("\nContains 'Ram' : " + myList.contains("Ram"));

		// arraylist capacity
		myList.ensureCapacity(10);
		System.out.println("\nCapacity of myList : " + myList);
		
		System.out.println("\nCheck if List is Empty? : " + myList.isEmpty());

		System.out.println("\nIndex of 'Sita' in List : " + myList.indexOf("Sita"));

	}

}
