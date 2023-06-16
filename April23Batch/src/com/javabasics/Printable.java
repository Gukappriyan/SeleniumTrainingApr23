package com.javabasics;

public interface Printable {
	
	void print();
	
	public default void printBike() {

		System.out.println("I am Abstract Method");

	}

}
