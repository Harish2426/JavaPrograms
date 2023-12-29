package CollectionFrameWork;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <String> stdName = new ArrayList<String>();
		//to add items/elements use method "add"
		stdName.add("Anudeep");
		stdName.add("Harish");
		stdName.add("krishna");
		//to access element in the ArrayLIst....get
		System.out.println(stdName);
      // access element in the ArrayList we use get() method
		System.out.println(stdName.get(0));
		//access elements in ArrayList using loop
		for (int i =0; i<stdName.size();i++) {
			System.out.println(stdName.get(i));
		}
		System.out.println("-----------");
	}

}
