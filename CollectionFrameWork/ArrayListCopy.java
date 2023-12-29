package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListCopy {

	public static void main(String[] args) {
		ArrayList <Integer> number1 =new ArrayList<Integer>();
         ArrayList <Integer>number2 = new ArrayList<Integer>();
            number1.add(100);
			number1.add(200);
			number1.add(300);
			number1.add(400);
			number1.add(500);
			System.out.println("Al 1:" +number1);
			System.out.println("AL 2:" +number2);
			Collections.copy(number1, number2); 
			System.out.println("AL 2:"+number2);
	}

}
