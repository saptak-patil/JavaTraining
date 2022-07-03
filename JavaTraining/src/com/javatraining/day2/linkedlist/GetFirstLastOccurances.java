/*
 6. Write a Java program to get the first and last 
 occurrence of the specified elements in a linked list. 
 */

package com.javatraining.day2.linkedlist;

import java.util.LinkedList;

public class GetFirstLastOccurances {

	public static void main(String[] args) {
		LinkedList<String> testList = new LinkedList<>();
		testList.add("Ram");
		testList.add("Sita");
		testList.add("Sham");
		testList.add("Bhim");
		testList.add("Karna");

		System.out.println("List : " + testList);

		System.out.println("First Node: " + testList.getFirst());
		System.out.println("Last Node: " + testList.getLast());
	}
}
