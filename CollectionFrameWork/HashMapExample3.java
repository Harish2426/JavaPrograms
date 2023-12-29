package CollectionFrameWork;
import java.util.HashMap;

public class HashMapExample3 {

	public static void main(String[] args) {
		HashMap <Integer, String> h1= 
				new HashMap<Integer,String>();
		HashMap <Integer, String> h2= 
				new HashMap<Integer,String>();
		
		h1.put(1, "Red");
		h1.put(2, "Yellow");
		h1.put(3, "Black");
		System.out.println("Map1:"+h1);
		
		h2.put(4, "Green");
		h2.put(5, "Blue");
		h2.put(6, "White");
		System.out.println("Map2:"+h2);
		
		//concate both map we use putAll() in a second method
		h2.putAll(h1);
		System.out.println(h2);
		//OR
		h1.putAll(h2);
		System.out.println(h1);

	}

}
