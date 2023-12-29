package CollectionFrameWork;
//Write a Java program to retrieve an element at 3rd index from a given array list.
import java.util.ArrayList;
public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList <Integer> number = new ArrayList<Integer>();
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(400);
		number.add(500);
		System.out.println(number);
		number.set(3, 250);
		System.out.println("after retrieve"+number);

	}

}
