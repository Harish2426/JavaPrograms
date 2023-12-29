package CollectionFrameWork;
import java.util.PriorityQueue;
public class QueExample {

	public static void main(String[] args) {
		PriorityQueue <String> q = new PriorityQueue <String>();
		q.add("A");
		q.add("C");
		q.add("D");
		q.add("B");
		q.add("Bd");
		System.out.println(q);
		System.out.println("Top :"+" " + q.peek());
		//remove query 
		q.remove("C");
		System.out.println("After Removing C : "+q);
		
	}

}
