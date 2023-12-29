package Harish;

public class Circle {
	float pi=3.14f;int radius;
	Circle(int r){
    radius=r;
	}
	void showData(){
		System.out.println("area of circle ="+(pi*radius*radius));
	}
	public static void main(String[] args) {
		
		Circle ca=new Circle(7);
		ca.showData();
		
	}

}
