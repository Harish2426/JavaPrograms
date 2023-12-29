package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Collections;//import class
//collection is an interface while collections is a class
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList <Integer> number = new ArrayList<Integer>();
		number.add(100);
		number.add(30);
		number.add(56);
		number.add(6);
		number.add(90);
		for (int i :number) {
			System.out.println(i);
		}
		System.out.println("---------");
		Collections.sort(number);
		for(int i :number) {
			System.out.println(i);
		}

	}

}
