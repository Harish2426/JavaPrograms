package CollectionFrameWork;
// 2.Write a Java program to find numbers 
//less than 7 in a tree set.
/*3.Write a Java program to add all the elements of a 
 * specified tree set to another tree set.(Union)*/
//4.Write a Java program to iterate through all elements in a tree set.
/*5.Write a Java program to get the first and last elements in a tree set.*/
import java.util.TreeSet;

public class TreeSetNo {
		public static void main(String[] args) {
			TreeSet <Integer>numbers= new TreeSet<Integer>();
			numbers.add(1);
			numbers.add(2);
			numbers.add(3);
			numbers.add(4);
			numbers.add(5);
			numbers.add(6);
			numbers.add(7);
			//2.lower than 7 
			System.out.println("Lower than 7 ="+numbers.lower(7));
			TreeSet <Integer>numbers1= new TreeSet<Integer>();
			numbers1.add(20);
			numbers1.add(30);	
			//3.union
			numbers.addAll(numbers1);
			System.out.println("union = "+numbers);
			//4.iterating all
		for (int i :numbers) {
			System.out.println("iterated : "+i);
		}
		//5.accesing first and last elements
		System.out.println("First Value:"+numbers.first());
        System.out.println("Last Value:"+numbers.last());
        //descending/reverse order views
        for(int i:numbers.descendingSet()) {
        	System.out.println("numbers in descending form :"+i);
        }
	}

}
