package Harish;
// Write a Java program to check whether a character is an alphabet, digit or special character.
//(take input from user)
import java.util.*;//intialized Scanner class 
public class CheckAlfa 
{

	public static void main(String[] args) //main method
	   {

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter any caracter : ");
		        char ch = sc.next().charAt(0);

		        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))//condition for alphabet
		        {

		             System.out.println(ch + "this is A ALPHABET.");

		        } 
		        else if(ch >= '0' && ch <= '9') // condition for digit
		        {

		             System.out.println(ch + " this is A DIGIT.");

		        }
		        else {

		             System.out.println(ch + " This is a special character.");
		        }
		    
       }
}

