package CollectionFrameWork;
import java.util.HashMap;
import java.util.HashMap;

public class HashMapforEach {

	public static void main(String[] args) {
		HashMap<Integer, String>std = new HashMap<Integer, String>();
		std.put(1, "harish");
		std.put(2, "haripriya");
		std.put(3, "shiva");
		std.put(4, "parvati");
		std.put(5, "krishna");
		//display values
		System.out.println("values : ");
		for(String i:std.values()) 
		{
			System.out.println(i);
		}
		//display keys
		System.out.println("keys :");
		for(int i : std.keySet()) {
			System.out.println(i);
		}
		//display key and value together
		System.out.println("-----------------------------");
		for (int x:std.keySet()) {
			System.out.println("Key:"+x+"values"+std);
		}
	}
}
