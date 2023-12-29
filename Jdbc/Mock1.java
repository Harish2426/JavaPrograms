package Jdbc;
import java.util.HashSet;
//we know hashset stores only unique values.
//1. Given an array of integers, write a Java program to find and print all the duplicate elements.
public class Mock1 
{

	public static void main(String[] args) 
	{
		
		        int[] array = {3, 2, 7, 8, 6, 2, 7, 1, 3, 9};

		        // Created a HashSet to store unique elements
		        HashSet<Integer> unique = new HashSet<Integer>();
		        // Created another HashSet to store duplicate elements
		        HashSet<Integer> duplicate = new HashSet<Integer>();

		        // Iterate through the array
		        for (int num : array) 
		        {
		            // If the element is already in unique, add it to duplicate hashset
		            if (!unique.add(num)) 
		            {
		                duplicate.add(num);
		            }
		        }

		        // Print duplicate elements
		        System.out.println("Duplicate elements in the array are: " + duplicate);
		    }	
	}
