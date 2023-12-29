package CollectionFrameWork;

import java.util.TreeSet;

public class TreeSetEXAMPLEE {

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
		t1.add(77);
		t1.add(66);
		t1.add(67);
		System.out.println("t1 :"+t1);
		//union---
		//t.addAll(t1);
		//System.out.println("Union:"+t);
		//intersection    returns the common element
//		t.retainAll(t1);
//		System.out.println("Intersection :"+t1);
		//Difference ...... t1 munus t2
		t.remove(t1);
		System.out.println("Difference :"+t);
	}

}
