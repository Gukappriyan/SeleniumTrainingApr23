package com.javabasics;

public class Child extends Parent {

	public void bike() {
		System.out.println("My Bike");
	}

	public static void main(String[] args) {

		Parent objPa = new Parent();

		objPa.house();

		Child objCh = new Child();
		objCh.house();
		objCh.car();
		objCh.bike();
	}

}
