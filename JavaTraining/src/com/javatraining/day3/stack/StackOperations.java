/*
 * Write a Java program which handles Push operation and Pop operation on stack 
 * concurrently.
 */
package com.javatraining.day3.stack;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {

		Stack<String> myStack = new Stack<String>();

		// pushing elements in stack if stack is empty
		if (myStack.isEmpty()) {
			myStack.push("Ram");
			myStack.push("Krishna");
			myStack.push("Sita");
			myStack.push("Jai");
			myStack.push("Radha");
			myStack.push("Bhim");
			myStack.push("Arjun");
			myStack.push("Karna");
			myStack.push(null); // null can be assigned to stack
		}

		System.out.println("Stack : " + myStack);

		if (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
			System.out.println(myStack.pop());
			System.out.println(myStack.pop());
			
		}

		System.out.println(myStack.capacity());

		System.out.println("Stack after Operations : " + myStack);
	}
}
