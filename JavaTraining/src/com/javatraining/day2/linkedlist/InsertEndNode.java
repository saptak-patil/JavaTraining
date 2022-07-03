/*
4. Write a Java program to insert the specified element at the end of a linked list.
 */
package com.javatraining.day2.linkedlist;

import java.util.LinkedList;

public class InsertEndNode {
	public static void main(String[] args) {
		LinkedList<Integer> testList = new LinkedList<Integer>();
		testList.add(11);
		testList.add(25);
		testList.add(73);
		testList.add(82);
		testList.add(90);

		System.out.println("List Before : " + testList);

		if (testList.offerLast(97)) {
			System.out.println("Element add to End");
		} else {
			System.out.println("Element not added");
		}
		System.out.println("List After : " + testList);
	}
}
