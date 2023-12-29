package Harish;
// Write a Java program to check whether a triangle is Equilateral, Isosceles or Scalene.

import java.util.Scanner; // Scanner class for user input

public class TriangleProject
{
    public static void main(String args[])//main method
    {
    	// Function to check if the triangle
    	// is equilateral or isosceles or scalene
        int a,b,c; // instantiated local variables here12
        Scanner sc=new Scanner(System.in);// created object sc of Scanner class
        System.out.println("Enter 3 angles of a triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
          if (a == b && b == c)
          {
        		  System.out.print("This is an Equilateral traingle."); // Check for equilateral triangle
          }
          else if (a == b || b == c || a == c)  
          {
        	      System.out.print("This is an isosceles triangle.");  // Check for isosceles triangle
          }
          else  
        	      System.out.print("This is an Scalen triangle"); // Otherwise scalene triangle
      
    }
}  