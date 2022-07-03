/*
4. Write a Java program to create a new String object with the contents of a character array. 
Sample Output:
 
The book contains 234 pages.
*/
package com.javatraining.day1.strings;

public class StringObjectCharacterArray {

	public static void main(String[] args) {

		char[] myArray = new char[]{'0', '1', '2', '3', '4', '5'};
//		char[] myArray = new char[]{0,1,2,'s','a'};
//		char[] myArray = {0, 1, 2, 3, 4, 5};
		
//		string object conversion
		String myString = String.copyValueOf(myArray, 2, 3);
		
//		String myString = new myString(.copyValueOf(myArray, 2, 3);

		
		System.out.println("The book contains " + myString + " pages.");
		
	}

}
