package Harish;
/* Write a program to print the area and perimeter of a triangle
 *  having sides of 3, 4 and 5 units by creating a class named
 *   'Triangle' without any parameter in its constructor.
 */
public class TriangleByMe {
     float s1=3.0f ,s2=4.0f, s3=5.0f;
     double s, area;
     TriangleByMe(){
    	 double perimeter=0;
    	 perimeter = s1+s2+s3;
    	 s=perimeter/2;
    	 area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    	 System.out.println(area);
    	 
    	 
     }
	public static void main(String[] args) {
		TriangleByMe tr = new TriangleByMe();
		

	}

}
