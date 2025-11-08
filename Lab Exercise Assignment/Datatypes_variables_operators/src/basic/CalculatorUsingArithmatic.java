package basic;

import java.util.Scanner;

public class CalculatorUsingArithmatic {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        // Arithmetic operations
	        System.out.println("\n--- Arithmetic Operations ---");
	        System.out.println("Addition: " + (a + b));
	        System.out.println("Subtraction: " + (a - b));
	        System.out.println("Multiplication: " + (a * b));
	        System.out.println("Division: " +(a / b));
	        System.out.println("Modulus: " + (a % b));

	        // Relational comparisons
	        System.out.println("\n--- Relational Comparisons ---");
	        System.out.println("a == b : " + (a == b));
	        System.out.println("a != b : " + (a != b));
	        System.out.println("a > b  : " + (a > b));
	        System.out.println("a < b  : " + (a < b));
	        System.out.println("a >= b : " + (a >= b));
	        System.out.println("a <= b : " + (a <= b));
	}

}
