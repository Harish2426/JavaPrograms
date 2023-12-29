package Harish;

public class Person {
			
			int age;
			String name;
			Person (int a, String n) 
			{
				age =a;
				name =n;
				}
			void showData() 
			{
			System.out.println("the person's age is "+age );
			System.out.println("the name of a person is " + name);
	        }
		public static void main (String[] args) {
			Person p= new Person(24, "harish");
			p.showData();
		}
	}


