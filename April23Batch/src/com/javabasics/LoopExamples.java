package com.javabasics;

public class LoopExamples {

	public static void main(String[] args) {
		// Loop
		int i = 1;

		while (i <= 100) {

			System.out.println(i);
			i++;
		}

		// For Loop

		for (int x = 2; x <= 4; x++) {
			System.out.println("Value of x:" + x);
		}

		for (int x = 100; x >= 90; x--) {

			System.out.println("Value of x:" + x);

		}

		// Do While

		int x = 18;
		do {
			// The line will be printed even
			// if the condition is false
			System.out.println("Value of x:" + x);
			x++;
		} while (x < 20);

		String array[] = { "Ron", "Harry", "Hermoine"};

		// enhanced for loop
		for (String j : array) {
			System.out.println(j);
		}
		
		// for loop for same function 
		for (int z = 0; z < array.length; z++) 
		{ 
			System.out.println(array[z]); 
		} 
		
		
		


	}

}
