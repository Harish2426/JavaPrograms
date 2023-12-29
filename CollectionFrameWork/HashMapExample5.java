package CollectionFrameWork;
import java.util.HashMap;
public class HashMapExample5 
{

	public static void main(String[] args) 
	{
		HashMap <Integer, String> h1 = new HashMap <Integer, String>();
		h1.put(1, "Red");
		h1.put(2, "Yellow");
		h1.put(3, "Black");
		h1.put(4, "Green");
		System.out.println(h1);
		if(h1.containsKey(6)) 
		{
			System.out.println("data found");
		}
		else 
		{
			System.out.println("not found");
		}
	}
}
