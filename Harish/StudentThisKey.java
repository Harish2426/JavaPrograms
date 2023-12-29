package Harish;

class Test {

//	public static void main(String[] args) {
		
		int rollno;
		String name;
		void getData (int rollno, String name) {
			//instance variable = local variable
			this.rollno = rollno;
			//instance variable = local variable that's why used this keyword
			this.name=name;
			}
		void showData() {
			System.out.println(rollno+ " " +name);
			
		}

	}
public class StudentThisKey{
	public static void main (String[] args) {
		Test s1= new Test();
		s1.getData(102,"xyz");
		s1.showData();
	}
}
