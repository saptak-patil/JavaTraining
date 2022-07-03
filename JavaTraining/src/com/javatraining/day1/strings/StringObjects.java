/*
6 Write a Java program to check whether two String objects contain the same data. 
Sample Output:
 
"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "Mike Royko"? false
 */

package com.javatraining.day1.strings;

public class StringObjects {

	public static void main(String[] args) {


		String myStringObject1 = new String("Walter Winchell");
		String myStringObject2 = new String("Mike Royko");

		String myStringObject3 = new String("Stephen Edwin King");

		
		System.out.println(" Stephen Edwin King' equals '" + myStringObject1 + "' ? : " + myStringObject3.equals(myStringObject1));
		System.out.println(" Stephen Edwin King' equals '" + myStringObject2 + "' ? : " + myStringObject3.equals(myStringObject2));
		
		
	}

}
