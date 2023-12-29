package CollectionFrameWork;
import java.util.HashMap;//package
/*6. Write a Java program to copy all mappings from 
 * the specified map to another map.(HashMap)*/
public class HashMapCopy //class
{

	public static void main(String[] args) // main method / entry point of program
	{
		HashMap <Integer,String> map = new HashMap<Integer,String>();// created "map" object for 1st hashmap
		// used put() method here for inserting values
		map.put(10, "Harish");
		map.put(20, "Soft Eng");
		map.put(30, "Package");
		map.put(40, "Location");
		System.out.println("First map Output :"+map);
		HashMap<Integer, String>map1 = new HashMap<Integer, String>();//created map1 for 2nd hashmap
		// again put() method for 2nd hashmap
		map1.put(1, "Senior");
		map1.put(2, "Manager");
		map1.put(3, "30LPA");
		map1.put(4, "bangaluru");
		System.out.println("Second map Output :"+map1);
		// we used putAll()method for copying all mappings from the 2nd map
		map.putAll(map1);
		System.out.println("After copy Output : "+" "+map);
		
	}

}
