package CollectionFrameWork;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Integer,String> h= new HashMap<Integer,String>();
		h.put(1, "Red");
		h.put(2, "Green");
		h.put(3, "Black");
		h.put(4, "Yellow");
		h.put(5, "White");
		for(Map.Entry x:h.entrySet()) {
			System.out.println("Key:"+x.getKey()+" "+x.getValue());
			
			
		}

	}

}
