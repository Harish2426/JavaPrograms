package Harish;

class West {

//	public static void main(String[] args) {
		
		int rollno;
		String name;
		void getData (int rollno, String name) {
			this.rollno = rollno;
			this.name=name;
			}
		void showData() {
			System.out.println(rollno+ " " +name);
			
		}

	}
public class KeywordThis{
	public static void main (String[] args) {
		West s1= new West();
		West s2= new West();
		s1.getData(102,"xyz");
		s1.showData();
		s2.getData(103,"xyyz");
		s2.showData();
	}
}
