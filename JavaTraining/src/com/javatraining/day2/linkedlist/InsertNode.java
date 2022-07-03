/*
1. Write a Java program to insert the specified element 
at the specified position in the linked list.
*/

package com.javatraining.day2.linkedlist;

import java.util.LinkedList;

public class InsertNode {

	public static void main(String[] args) {
		LinkedList<Integer> testList = new LinkedList<Integer>();
		testList.add(11);
		testList.add(25);
		testList.add(73);
		testList.add(82);
		testList.add(90);
		
		System.out.println("List Before : " + testList);
		testList.add(2, 45);
		System.out.println("List After : " + testList);

	}

}
