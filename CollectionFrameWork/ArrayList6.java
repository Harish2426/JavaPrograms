package CollectionFrameWork;

import java.util.ArrayList;

public class ArrayList6 {

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
            //to search data use contains()
            if(number.contains(65)) 
            {
	         System.out.println("found");
            }
           else {
	       System.out.println("not found");
           }
	}

	}

