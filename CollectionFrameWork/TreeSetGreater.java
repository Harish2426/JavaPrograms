package CollectionFrameWork;
import java.util.Iterator;
/*4.Write a Java program to get the element in a tree 
 * set strictly greater than or equal to the given element.*/
import java.util.TreeSet;
public class TreeSetGreater 
{

	public static void main(String[] args) //main method entry point of program
	{
		TreeSet<Integer>numbers = new TreeSet<Integer>();// created "numbers" name of object using TreeSet 
		//add method for inserting data in Treeset.
		numbers.add(25);
		numbers.add(45);
		numbers.add(10);
		numbers.add(20);
		numbers.add(66);
		numbers.add(15);
		numbers.add(100);
		// iterating all elements to check the numbers comparison
		for(int i :numbers) 
		{
			if(i>=20) //condition for given question i.e greater than or equal to the given element
			{
				System.out.println("Greater than 20 or equal to 20 are = "+i);
			}
		}
	}

}
