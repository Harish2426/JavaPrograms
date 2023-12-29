package Harish;
//create a class named as "Rectangle" having 2 methods ..
//one for getting length and breadth of rectangle and 
//another is for  displaying result. Create 3 objects for this class.
 class Rectangle {
	int len, breadth,result ;
	
      void getData(int len,int breadth)
      {
    	  this.len=len;
    	  this.breadth=breadth;
    	  result = len*breadth;
    	  
      }
      void showData() {
    	  
    	  System.out.println("length = "+ len);
    	  System.out.println("breadth = "+ breadth);
    	  System.out.println("area of rectangle"+result);
      }}
    public class Hari12{
	public static void main(String[] args) {
		Rectangle rc=new Rectangle();
		rc.getData(10,20);
		rc.showData();
	}

}
