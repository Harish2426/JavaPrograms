package CollectionFrameWork;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList <String> stdName = new ArrayList<String>();
		//to add items/elements use method "add"
		stdName.add("Anudeep");
		stdName.add("Harish");
		stdName.add("krishna");
		//to access element in the ArrayLIst....get
		System.out.println(stdName);
		stdName.add("xyz");
		System.out.println(stdName);
      // access element in the ArrayList we use get() method
		System.out.println(stdName.get(0));
	// to update / modify an element use set();
		stdName.set(0, "ABC");
		System.out.println("After Update:" + stdName);
		//to remove/delete any element use remove();
		stdName.remove(3);
		System.out.println("After removing: "+stdName);
		// to delete/remove all elements from the  list use clear();
		stdName.clear();
		System.out.println("after clear:"+stdName);
		// to find how many elements are present use size();
		stdName.size();
		System.out.println("size of all :"+stdName.size());
		/*//access elements in ArrayList using loop
		for (int i =0; i<stdName.size();i++) {
			System.out.println(stdName.get(i));
		}
		System.out.println("-----------");*/
	}

}
