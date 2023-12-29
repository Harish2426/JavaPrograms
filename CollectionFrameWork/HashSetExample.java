package CollectionFrameWork;
import java.util.HashSet;
// hashset is a collection of unique elements
//if you add duplicate elements , it will consider as one.

public class HashSetExample {

	public static void main(String[] args) {
		HashSet <String > countries = new HashSet <String >();
		countries.add("India");
		countries.add("Nepal");
		countries.add("japan");
		countries.add("USA");
		countries.add("Indonesia");
		countries.add("Russia");
		 
		System.out.println(countries);
		//size of the hashset
		System.out.println(countries.size());
		//loop  for each
		
		for(String i :countries) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		//to remove element
		countries.remove("Pakistan");
		System.out.println(countries);
		//to remove all objects
		countries.clear();
		System.out.println(countries);
		
		

	}

}
