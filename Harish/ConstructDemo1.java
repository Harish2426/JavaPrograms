package Harish;

public class ConstructDemo1 {
     void fun () {
    	 System.out.println("function called");
     }
    void ConstructDemo1(){
 		System.out.println("constructor called");
 	}
     public static void main (String[] args)
     {
    	 ConstructDemo1 c1= new ConstructDemo1();
    	 c1.fun();
     }
}
