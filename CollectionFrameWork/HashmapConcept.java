package CollectionFrameWork;
import java.util.HashMap;

public class HashmapConcept {

	public static void main(String[] args) {
		HashMap <Integer, String> std= new HashMap <Integer, String>();
		//to insert value we use put();
		std.put(101, "Harish");
		std.put(102, "Haripriya");
		std.put(103, "Nikita");
		System.out.println(std);
		//to access element use get();
		System.out.println(std.get(101));
		//to remove or delete some data
		std.remove(103);
		System.out.println("After remove 103 :"+std);
		//to remove all the data we use clear();
		std.clear();
		System.out.println(std);
	}

}
