package com.javabasics;

public class ExampleStudent extends Student{

	

	public ExampleStudent(String getName, int getAge, String getAddress) {
		super(getName, getAge, getAddress);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1 = new Student("Priyan", 35, "Chennai");
		
		std1.printStudent();

	}

}
