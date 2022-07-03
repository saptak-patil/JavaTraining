/*
2. Write a Java program to insert elements into the linked list 
at the first and last position.  
*/
package com.javatraining.day2.linkedlist;

import java.util.LinkedList;

public class InsertNodeFirstLast {
	public static void main(String[] args) {
		LinkedList<Integer> testList = new LinkedList<Integer>();
		testList.add(11);
		testList.add(25);
		testList.add(73);
		testList.add(82);
		testList.add(90);

		System.out.println("List Before : " + testList);
		testList.addFirst(5);
		testList.addLast(95);
		System.out.println("List After : " + testList);

	}

}
