/*
Write a Java program which first generates a set of random numbers 
and then determines negative, positive even, positive odd numbers concurrently.
 */

package com.javatraining.day3.threads;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

class GenNumber extends Thread {

	public ArrayList<Integer> numList = new ArrayList<Integer>();

	@Override
	public void run() {
		try {
			int num = ThreadLocalRandom.current().nextInt(25);
			numList.add(num);

			if (num % 2 == 0) {
				System.out.println("Positive Even number : " + num);
			} else if (num % 2 == 1) {
				System.out.println("Positive Odd number : " + num);
			} else {
				System.out.println("Negative number : " + num);
			}
		} catch (IllegalThreadStateException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class RandomNumbersTreads {

	public static void main(String[] args) {

//		Runnable r = new GenNumber();
//		Thread thread = new Thread(r);
		
		GenNumber obj = new GenNumber();

		try {
			for(int i = 0; i < 10; i++) {
				obj.start();
//				obj.stop();
			}
		} catch (IllegalThreadStateException e) {
			e.printStackTrace();
		}
	}

}
