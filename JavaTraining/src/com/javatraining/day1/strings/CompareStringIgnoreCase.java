/*
7 Write a Java program to compare a given string to another string, ignoring case considerations. 
Sample Output:
 
"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "stephen edwin king"? true 
 */

package com.javatraining.day1.strings;

public class CompareStringIgnoreCase {

	public static void main(String[] args) {
		String myString1 = new String("Walter Winchell");
		String myString2 = new String("stephen edwin king");

		String myString3 = new String("Stephen Edwin King");

		
		System.out.println(" Stephen Edwin King' equals '" + myString1 + "' ? : " + myString3.equalsIgnoreCase(myString1));
		System.out.println(" Stephen Edwin King' equals '" + myString2 + "' ? : " + myString3.equalsIgnoreCase(myString2));
		
	}

}
