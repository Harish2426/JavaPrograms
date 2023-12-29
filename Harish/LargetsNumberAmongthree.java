package Harish;
// Write a Java program to find the largest between 3 numbers using Ternary Operator.
//(take input from user)
import java.util.*;
public class LargetsNumberAmongthree {
	// Java Program to Find Largest
	// Between Three Numbers Using
	// Ternary Operator (take input from user)
		public static void main(String args[])// Main function
		{
			// Variable Declaration
			int a = 10, b = 25, c = 15, max;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter three numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();

			// condition Maximum among a, b, c
			max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

			// Print the largest number
			System.out.println("Maximum number among " + a
							+ ", " + b + " and " + c + " is "
							+ max);
		}
	}
