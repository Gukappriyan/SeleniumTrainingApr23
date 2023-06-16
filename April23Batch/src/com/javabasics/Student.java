package com.javabasics;

public class Student {

	String name;
	int age;
	String address;

	public Student(String getName, int getAge, String getAddress) {
		this.name = getName;
		this.address = getAddress;
		this.age = getAge;

	}
	
	public void printStudent() {
		
		System.out.println("Student Name" + name);
		System.out.println("Student Age" + age);
		System.out.println("Student Address" + address);
	}

}
