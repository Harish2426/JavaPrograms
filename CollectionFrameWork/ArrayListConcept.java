package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Collections;
/*1. Write a Java program to create a new array list, 
 * add some elements (string) and print out the collection
2. Write a Java program to insert an element into the array list at the first position
3. Write a Java program to remove the fifth element from a array list
4. Write a Java program to sort a given array list
5. Write a Java program to reverse elements in a array list
6.Write a Java program to update specific array element by given element
7.Write a Java program to search an element in a array list
8.Write a Java program to retrieve an element (at a specified index) from a given array listl*/
public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList <String> element = new ArrayList<String>();
		element.add("harish");
		element.add("SoftEngineer");
		element.add("hyderabad");
		element.add("flat");
		element.add("rent");
		element.add("usage");
		//1st question
		System.out.println(element);
		//2nd question
		element.set(0,"candidate");
		System.out.println("after adding it on first :"+element);
		//3rd question
		element.remove(5);
		System.out.println("after removing 5th element :"+element);
		//4th question Sort the ArrayList in ascending order
        Collections.sort(element);
        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " +element );
        //5th question
        Collections.reverse(element);
        System.out.println("after reversing the list"+element);
        //6th question
        element.set(2, "banglore");
        System.out.println("updated hyderabad  to banglore "+element);
        //7th question
       if (element.contains("banglore")) {
    	   System.out.println("found");
    	   }
       else {
    	   System.out.println("not found");
       }
       //8th question
       Collections.reverse(element);
       System.out.println("after reversing :"+element);
       int indexToRetrieve = 2; // This will retrieve "Cherry"
       Collections.swap(element, 3, 4);
       System.out.println("after swappng flat to usage"+element);
        }
    }

