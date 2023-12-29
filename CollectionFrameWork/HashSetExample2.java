package CollectionFrameWork;
import java.util.HashSet;

public class HashSetExample2 {

	public static void main(String[] args) {
		HashSet<Integer>numbers = new HashSet<Integer>();
		//to insert element
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		//loop
		for(Integer i:numbers) {
			System.out.println(i);
			if(i==0) {
				System.out.println("the numbers is emppty");
			}
			else {
				System.out.println("not empty");
			}
		}
		System.out.println(numbers);
		
		
		//remove  30 from list
		numbers.remove(30);
		System.out.println(numbers);
		numbers.clear();
		System.out.println(numbers);

	}

}
