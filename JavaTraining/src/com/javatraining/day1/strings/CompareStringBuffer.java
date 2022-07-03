/*
3. Write a Java program to compare a given string to the specified string buffer. 
Sample Output:
 
Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false 
*/

package com.javatraining.day1.strings;

public class CompareStringBuffer {

	public static void main(String[] args) {

		
		String string1 = "example.com";
		String string2 = "Example.com";

		StringBuffer stringBufferObject = new StringBuffer("example.com");
				
//		compare a string with other using string buffer
		System.out.println("check 'example.com' in sequence string : " + string1.contains(stringBufferObject));
		System.out.println("check 'Example.com' in sequence string : " + string2.contains(stringBufferObject));
	}
}
