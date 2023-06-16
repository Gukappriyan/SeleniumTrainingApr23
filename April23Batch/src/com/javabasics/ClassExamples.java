package com.javabasics;

public class ClassExamples {

	 String name;
	 String address;
	
	public void printStudent() {
		
		System.out.println(this.name + "- "+ this.address);
	}
	 
	public static void main(String[] args) {
		
	   ClassExamples objClassEx = new ClassExamples();
	   
	   objClassEx.name = "Srinath";
	   objClassEx.address = "HYD";
	   
	   objClassEx.printStudent();
	   
	   ClassExamples objClassEx1 = new ClassExamples();
	   objClassEx1.name = "Magnath";
	   objClassEx1.address = "BANG";
	   
	   objClassEx1.printStudent();
		

	}

}
