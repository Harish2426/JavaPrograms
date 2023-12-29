package CollectionFrameWork;
//3. Write a Java program to get the number of elements in a hash set.
import java.util.HashSet;//package
public class HashSetGet //class
{

	public static void main(String[] args) // main method the entry point
	{
		HashSet <Integer>numbers = new HashSet<Integer>(); // created "numbers" name of object using HashSet class
		//add() method is for getting the numbers
		numbers.add(14);
		numbers.add(34);
		numbers.add(50);
		numbers.add(46);
		numbers.add(10);
		numbers.add(10);
		//numbers.add(14);//hashset prints unique elements that's  why it's not needed
		//printing these numbers
        System.out.println("All Numbers in HashSets are ="+numbers);
	}

}
