package CollectionFrameWork;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAscendingD {

	public static void main(String[] args) {
			TreeSet <Integer>numbers= new TreeSet<Integer>(); 
			numbers.add(1);
			numbers.add(2);
			numbers.add(3);
			numbers.add(4);
			numbers.add(5);
			numbers.add(6);
			numbers.add(7);
			System.out.println(numbers);
			//ascending
			Iterator<Integer>it =numbers.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("-----------------");
			//descending
			Iterator<Integer>desc = numbers.descendingIterator();
			while(desc.hasNext()) {
				System.out.println(desc.next());
			}
	}

}
