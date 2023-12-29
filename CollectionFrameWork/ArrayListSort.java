package CollectionFrameWork;
//1. Write a Java program to sort a given array list.
import java.util.ArrayList;// package 
import java.util.Collections;//sorting is supported in collections 

public class ArrayListSort//class
{

	public static void main(String[] args) //main method(entry point)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();// created "numbers" name of  object using ArrayList Class
		//used add() method is for inserting element
		numbers.add(23);
		numbers.add(20);
		numbers.add(30);
		numbers.add(15);
		System.out.println(numbers);
		//now let's sort it
		Collections.sort(numbers);
		System.out.println("After Sorting :"+" "+numbers);
	}

}
