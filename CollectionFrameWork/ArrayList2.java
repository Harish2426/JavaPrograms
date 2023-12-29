package CollectionFrameWork;
import java.util.ArrayList;
//Write a Java program to iterate through all elements in an array list.
public class ArrayList2 {

	public static void main(String[] args) {
			ArrayList <Integer> number = new ArrayList<Integer>();
			number.add(100);
			number.add(200);
			number.add(300);
			number.add(400);
			number.add(500);
			for (int i :number) {
				System.out.println(i);
			}
			System.out.println("---------");
		

	}

}
