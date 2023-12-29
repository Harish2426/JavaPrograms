package Jdbc;
import java.util.Scanner;
//3. Write a Java program to print a right-angled triangle of stars. 
//The number of rows should be taken as input.
public class Mock3 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Take the number of rows as input
	        System.out.print("Enter the number of rows for the right-angled triangle: ");
	        int numRows = scanner.nextInt();

	        // Print the right-angled triangle
	        for (int i = 1; i <= numRows; i++) 
	        {
	            // Print spaces for another triangles as in RAT we don't need spaces
//	            for (int j = 1; j <= numRows - i; j++) {
//	                System.out.print(" ");
//	            }

	            // Print stars 
	            for (int k = 1; k <= i; k++) {
	                System.out.print(" *");
	            }

	            // Move to the next line after each row
	            System.out.println();
	        }

	        scanner.close();
	    }
	}
