package com.javabasics;

//Operators  Examples
public class OperatorsExamples {

	public static void main(String[] args) {

		int a, b, c, d, e = 100, addValue, subValue, multValue, divValue, mutValue, incre, decre;

		/*
		 * Relational Operators : > < >= <= == != 
		 * Logical Operators : && || & | ! ^
		 * Conditional Operator : ? 
		 * Bitwise Operator : & | ^ >> >>> 
		 * Compound Assignment
		 * Operators : += -= *= /= %=
		 * 
		 */

		// Assignment Operators : =

		a = 10;
		b = 5;
		c = 5;
		d = 12;

		// Arithmetic Operators : - + * / % ++ --
		// Add

		addValue = a + b;

		// Sub

		subValue = a - b;

		// Multiple

		multValue = a * b;

		// Division

		divValue = a / b;

		// Mul

		mutValue = a % b;

		// ++ --

		System.out.println("a + b = " + addValue);

		System.out.println("a - b = " + subValue);

		System.out.println("a * b = " + multValue);

		System.out.println("a / b = " + divValue);

		System.out.println("a % b = " + mutValue);

		System.out.println("After++ =" + a++);

		System.out.println("After++ =" + a);

		System.out.println("--Before = " + --b);

		System.out.println("--Before =" + b);

		// Relational Operators : > < >= <= == !=

		if (a > b) {

			System.out.println("a = 10, b = 5, A is big Number");
		}

		if (a < d) {

			System.out.println("a = 10, d = 12, A is smaller than D");
		}

		if (b <= c) {

			System.out.println("b is smaller value");
		}

		/*
		 * if ( b == c) {
		 * 
		 * System.out.println("b and c equals"); }
		 */

		// Logical Operators : && ||
		System.out.println(a + " , " + b + " , " + c + " , " + d);
		if ((a > b) && (d > c)) {

			System.out.println("A is Grethan B and d is Grethan c");
		}

		if ((a > b) || (c > d)) {

			System.out.println("A is Grethan B ");
		}
		
		//Compound Assignment Operators : += -= *= /= %=
		
		 e  = e + a;
		
		 //e += a;
		 
		 System.out.println(e);
		

	}

}
