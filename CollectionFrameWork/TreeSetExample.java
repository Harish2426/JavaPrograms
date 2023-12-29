package CollectionFrameWork;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet <Integer> t= new TreeSet<Integer>();
		// to add elements
		t.add(2);
		t.add(4);
		t.add(5);
		t.add(1);
		t.add(3);
		//sorted data will display
		System.out.println("Output : "+t);
		// lets create second treeset
		TreeSet <Integer> t1= new TreeSet<Integer>();
		t1.add(11);
		t1.add(21);
		t1.add(31);
		System.out.println("t1 ="+t1);
		//adding all elements in a single Treeset.
		//using addAll() Method
		t.addAll(t1);
		System.out.println("Both tree set in a single TreeSet ="+t);
		
		//accessing treeset
		Iterator<Integer> it = t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		t1.remove(5);
		System.out.println("After deletion:"+t);
		//accessing first and last value
		System.out.println("First Value :"+t.first());
		System.out.println("Second Value :"+t.last());
		
		
	}

}
