package com.javabasics;

public class TVS extends AbstractBike {

	public static void main(String[] args) {
		TVS objHo = new TVS();

		objHo.run();

	}

	@Override
	void run() {
		System.out.println("I am TVS Bike");

	}

}
