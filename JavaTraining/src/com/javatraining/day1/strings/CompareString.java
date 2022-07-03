/*
2. Write a Java program to compare a given string to the specified character sequence. 
Sample Output:
 
Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false
*/

package com.javatraining.day1.strings;

public class CompareString {

	public static void main(String[] args) {

		String string1 = "example.com";
		String string2 = "Example.com";

		CharSequence sequenceString = "example.com";
		
//		compare two strings with character sequence
		System.out.println("check 'example.com' in sequence string : " + string1.contains(sequenceString));
		System.out.println("check 'Example.com' in sequence string : " + string2.contains(sequenceString));	
	}
}