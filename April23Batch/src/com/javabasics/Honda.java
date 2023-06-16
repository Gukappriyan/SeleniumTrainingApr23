package com.javabasics;

public class Honda extends AbstractBike {

	public static void main(String[] args) {
		
		Honda objHo = new Honda();
		
		objHo.run();
		objHo.printBike();

	}

	@Override
	void run() {

		System.out.println("I am Honda Bike");

	}

}
