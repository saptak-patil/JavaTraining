/*
7. Write a Java program to display the elements and their positions in a linked list.
 */
package com.javatraining.day2.linkedlist;

import java.util.LinkedList;

public class DisplayList {

	public static void main(String[] args) {
		LinkedList<String> testList = new LinkedList<>();
		testList.add("Ram");
		testList.add("Sita");
		testList.add("Sham");
		testList.add("Bhim");
		testList.add("Karna");

		System.out.println("-- Linked List --");

		System.out.println("Position\tElement");
		for (int i = 0; i < testList.size(); i++) {
			System.out.println(i + "\t\t" + testList.get(i));
		}

	}

}
