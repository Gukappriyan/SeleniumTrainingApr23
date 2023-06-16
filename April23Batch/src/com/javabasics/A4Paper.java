package com.javabasics;

public class A4Paper implements Printable {

	public static void main(String[] args) {
		
		A4Paper objA4 = new A4Paper();
		objA4.print();
		

	}

	@Override
	public void print() {
		System.out.println("I am A4 Size Paper");
		
	}

}
