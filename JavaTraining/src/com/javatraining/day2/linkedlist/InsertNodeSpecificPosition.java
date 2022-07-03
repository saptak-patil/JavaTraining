/*
5. Write a Java program to insert some elements 
at the specified position into a linked list.  
 */

package com.javatraining.day2.linkedlist;

import java.util.LinkedList;

public class InsertNodeSpecificPosition {

	public static void main(String[] args) {
		LinkedList<String> testList = new LinkedList<>();
		testList.add("Ram");
		testList.add("Sita");
		testList.add("Sham");
		testList.add("Bhim");
		testList.add("Karna");

		System.out.println("List Before : " + testList);
		testList.add(2, "Lakshman");
		System.out.println("List After : " + testList);

	}
}
