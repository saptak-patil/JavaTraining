/*
1. Write a Java program to test if a given string contains the specified sequence of char values. 
Sample Output:
 
Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: and 
true 
*/

package com.javatraining.day1.strings;

public class SequenceCheck {

	public static void main(String[] args) {

		String myOriginalString = "PHP Exercises and Python Exercises";
		String checkString = "and";
		
//		check and sequence in original string
		System.out.println("Original String : " + myOriginalString);
		System.out.println("String to check in sequence : " + checkString);
		System.out.println("Check String : " + myOriginalString.contains("and"));
		
	}

}
