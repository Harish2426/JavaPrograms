package CollectionFrameWork;
import  java.util.TreeSet;
/*1. Write a Java program to create a tree set, 
 * add some colors (strings) and print out the 
 * tree set.*/
/*4.Write a Java program to add all the elements of 
 * a specified tree set to another tree set.(Union)*/
public class TreeSetcolors {

	public static void main(String[] args) {
		TreeSet <String>colors= new TreeSet<String>();
		colors.add("GREEN");
		colors.add("BLUE");
		colors.add("YELLOW");
		colors.add("BLACK");
		colors.add("RED");
		System.out.println(colors);
		
	}
	
	
}
