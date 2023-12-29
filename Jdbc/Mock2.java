package Jdbc;
import java.util.*;
public class Mock2{
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String x = "DINAI";
		String y = "INDIA";
		
		char a[]= x.toCharArray();
		char b[]= y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		if(result == true) 
		{
			System.out.println("strings are anagram");
		}
		else 
		{
			System.out.println("strings are not anagram");
		}
		
	}
}