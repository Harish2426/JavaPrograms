package Harish;

public class ConstructDemo {
	ConstructDemo(){
		System.out.println("constructor called");
	}
     void fun () {
    	 System.out.println("function called");
     }
     public static void main (String[] args)
     {
    	 ConstructDemo c1= new ConstructDemo();
    	 c1.fun();
     }
}
