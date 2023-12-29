package Harish;
import java.util.*;
//Write a Java program to accept two integers and check whether they are equal or not.
public class TwoIntegers 
{

			   public static void main( String args[] ) //main method
			   {
				   int a ,b;
				   Scanner sc = new Scanner(System.in);// sc object created from Scanner class
				                                       // for user input
				   System.out.println("Enter two integers");
				   a=sc.nextInt();
				   b=sc.nextInt();
				   if (a==b) // condition to check a & b ,either these r equal or not
				   {
			      System.out.println("integer a is equal to integer b  ");
				   }
			      else
			      {
			      System.out.println("integer a is not equal to integer b  ");
			      }
			   }
}
