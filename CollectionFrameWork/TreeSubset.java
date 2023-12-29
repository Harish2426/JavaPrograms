package CollectionFrameWork;

import java.util.TreeSet;

public class TreeSubset {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(12);
		t.add(23);
		t.add(78);
		t.add(90);
		t.add(67);
		System.out.println("t1:"+t);
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(24);
		t1.add(23);
		System.out.println("t1:"+t1);
		//subset or not?
		//containsAll(t1) .... returns boolean value
		//System.out.println("is t1 subset of t :?"+t.contains(t1));
        if(t.containsAll(t1)) {
        	System.out.println("t1 is subset of t");
        }
        else {
        	System.out.println("t1 is not subset of t");
        }
	}

}
