package CollectionFrameWork;
import java.util.ArrayList;
//Write a Java program to insert an element into the array list at the first position.
public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList <Integer> number = new ArrayList<Integer>();
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(400);
		number.add(500);
		System.out.println("normal output :"+number);
		//after inserting value
		number.set(0, 600);
		System.out.println("after insert :"+number);
		

	}

}
