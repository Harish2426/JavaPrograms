package CollectionFrameWork;
import java.util.LinkedList;

public class LinkedListex {

	public static void main(String[] args) {
		LinkedList <String> stdData = new LinkedList <String>();
		//insert values in the LinkedList
		stdData.add("harish");
		stdData.add("harish1");
		stdData.add("harish2");
		stdData.add("harish3");
		System.out.println(stdData);
		//insert value at 1st position
		stdData.addFirst("Engineer");
		System.out.println("Adding in Last"+stdData);
		// insert value at last position
		stdData.addLast("Location");
		System.out.println("Adding in last"+stdData);
		//remove value at 1st position
		stdData.removeFirst();
		System.out.println(stdData);
		//remove value at last position
		stdData.removeLast();
		System.out.println(stdData);
		//display 1st value
		System.out.println("First Value:"+stdData.getFirst());
		//display last value 
		System.out.println("Last Value:"+stdData.getLast());
		//delete data 
		stdData.remove("harish2");
		System.out.println("After delete  harish2"+stdData);
		
	}

}
