package CollectionFrameWork;
import java.util.HashMap;
public class HashMapEx4 {

	public static void main(String[] args) {
		HashMap<Integer, String>h1 = new HashMap<Integer, String>();
		h1.put(1, "Red");
		h1.put(2, "Yellow");
		h1.put(3, "Black");
		h1.put(4, "Green");
		
		//check it map is empty or not
		boolean result =h1.isEmpty();
		System.out.println("Is Map empty"+result);
		
		System.out.println("-----------clear mmethod-------");
		h1.clear();
		result= h1.isEmpty();
		System.out.println("is map empty?"+result);
	}

}
