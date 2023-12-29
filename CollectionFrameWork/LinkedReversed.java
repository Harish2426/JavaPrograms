package CollectionFrameWork;
//2. Write a Java program to iterate a linked list in   reverse order.
import java.util.LinkedList;//package
import java.util.Collections;//package for reverse operation
public class LinkedReversed //classname
{

	public static void main(String[] args) //entry point
	{
		LinkedList <Integer>no = new LinkedList <Integer>();// created "no" name of object using LinkList class
		no.add(1);
		no.add(2);
		no.add(3);
		no.add(4);
		no.add(5);
		//iterating all through for each loop
		for(int i :no) //condition
		{
			System.out.println("Iterating all : "+i);
		}
		//reversing it
		Collections.reverse(no);
		System.out.println("The Reversed Numbers is ="+" "+no);
		

	}

}
