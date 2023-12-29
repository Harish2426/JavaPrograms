package CollectionFrameWork;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		Stack<String> s= new Stack<String>();
		s.push("Harish");
		s.push("Soft Engineer");
		s.push("30 Lpa");
		System.out.println(s);
		//top element
//		String i=s.peek();
//		System.out.println("Top element "+i);
		System.out.println("Top element "+s.peek());
		//pop method is used to remove here
		s.pop();//onlly top element will remove through this method
		System.out.println("Poping elements"+s);
	}

}