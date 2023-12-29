package Harish;
//Write a Java program to demonstrate the use of Bitwise Operators
import java.util.Scanner;
public class Bitwise {
	// Java program to illustrate
	// bitwise operators
		public static void main(String[] args)//main method
		{
			// Initial values
			int a,b;
			Scanner sc = new Scanner (System.in);
			System.out.println("enter first number and");
			System.out.println("enter second number");
			a=sc.nextInt();
			
			 b=sc.nextInt();

			// bitwise and
			System.out.println("a&b = " + (a & b));

			// bitwise or
			System.out.println("a|b = " + (a | b));

			// bitwise xor
			System.out.println("a^b = " + (a ^ b));

			// bitwise not
			// will give 2's complement (32 bit)
			System.out.println("~a = " + ~a);

			// can also be combined with
			// assignment operator to provide shorthand
			// assignment
			// a=a&b
			a &= b;
			System.out.println("a= " + a);
		}
	}
