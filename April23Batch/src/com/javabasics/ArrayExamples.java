package com.javabasics;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {

		String array[] = { "Ron", "Harry", "Hermoine" };

		// enhanced for loop
		for (String j : array) {
			System.out.println(j);
		}
		
		int[] age;
		age = new int[5];
		
		age[0] = 10;
		age[1] = 11;
		age[2] = 12;
		age[3] = 13;
		age[4] = 14;
	//	age[5] = 15;
		
		for (int j : age) {
			System.out.println(j);
		}
 
		
		System.out.println(age[2]);
		
		System.out.println(age.length);
							
		System.out.println(Arrays.toString(age));
		
		

	}

}
