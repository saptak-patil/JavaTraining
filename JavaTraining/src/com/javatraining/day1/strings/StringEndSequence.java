/*
5 Write a Java program to check whether a given string ends with the contents of another string. 
Sample Output:
 
"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true
*/

package com.javatraining.day1.strings;

public class StringEndSequence {

	public static void main(String[] args) {
		
		String string1 = "Python Exercises";
		String string2 = "Python Exercise";
		String testString = "se";
		
		
		//		check if string 1 ends with contents of string 3
		System.out.println("End with 'se' in sequence string '" + string1 + "' : " + string1.endsWith(testString));
		
		//		check if string 1 ends with contents of string 3
		System.out.println("End with 'se' in sequence string '" + string2 + "' : " + string2.endsWith(testString));
		
	}

}
