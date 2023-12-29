package CollectionFrameWork;
//1. create a hashmap having 5 objects and 
//its key value should be of same type(String).
import java.util.HashMap;
public class HashMapString {

	public static void main(String[] args) {
		HashMap<String, String> country= new HashMap<String, String>();
		country.put("India", "delhi");
		country.put("Pakistan", "karachi");
		country.put("nepal", "Kathmandu");
		country.put("Africa", "kenya");
		country.put("USA", "Washington");
		System.out.println(country);
		/*3.Write a Java program to get a set view of the keys contained in this map.*/
		System.out.println("-----------------------------");
		for (String x:country.keySet()) {
			System.out.println("Key:"+x);
		//2.Write a Java program to get the value of a specified key in a map.
			System.out.println(country.get("India"));
			//4.Write a Java program to get a collection view of the values contained in this map
			for(String s : country.values()) {
				System.out.println(s);
			}
			
	}

	}
}
