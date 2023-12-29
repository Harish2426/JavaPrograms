package CollectionFrameWork;
/*5.Write a Java program to retrieve and remove the first element from the priority queue.*/
import java.util.PriorityQueue;//package

public class QueueQuest // class 
{

	public static void main(String[] args) //main method /entry point
	{
		PriorityQueue<Integer> element = new PriorityQueue <Integer>();//"element" object created using pQ
		//add() for inserting values/elements
		element.add(10);
		element.add(50);
		element.add(20);
		element.add(18);
		element.add(21);
		element.add(07);
		System.out.println(" NORMAL OUTPUT (All ELEMENTS) "+element);
		//let's try to retrieve the first element with peek() method
		System.out.println("retrieved first element :"+element.peek());
		// for removing the first elemtn we use poll() method     
		System.out.println("Removing the first element :"+element.poll());
		System.out.println("element after removing first element :"+element);
	}

}
