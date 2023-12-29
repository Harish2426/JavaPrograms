package CollectionFrameWork;
import java.util.LinkedList;
import java.util.Collections;

public class LinkLIst1 {

	public static void main(String[] args) {
		LinkedList <String> element = new LinkedList<String>();
		element.add("harish0");
		element.add("harish1");
		element.add("harish2");
		element.add("harish3");
		System.out.println("showing all :"+element);
		// appending on last 
		element.addLast("Harish");
		System.out.println("after addding it last"+element);
        //iterate through all list
		System.out.println(element);
		//reverseorder aranging
		Collections.reverse(element);
		System.out.println("after reverse :"+element);
		//specified element in specified location
		element.set(3, "replaced name");// on location 3 it'll be located
		System.out.println("after replaced:"+element);
		//remove first and last element
		element.removeFirst();
		element.removeLast();
		System.out.println("removed first"+element);
		System.out.println("remove last"+element);
		// insert some elements at the specified position into a linked list.
		element.set(0,"NEW VALUE");
		System.out.println("after inserting the new value at 0 position:"+element);
		//remove all element from the linked list
		element.clear();
		System.out.println("all cleared"+element);
		
	}
}
