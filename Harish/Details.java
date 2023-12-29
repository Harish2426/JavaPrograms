package Harish;
/*Create a class named as "Details". 
Display the details of 3 employees. 
empName,empNum,phone,age using parameterized constructor.*/
public class Details {
	String empName;
	int phone,age;
	
	 Details(String empName,int phone, int age) {
		 this.empName=empName;
		 this.phone =phone;
		 this.age=age;
		
	}
	void showData() {
    System.out.println("the details of emloyee is = " +" "+ empName +" "+ (phone)+" " +(age));
	}

	public static void main(String[] args) {
		Details dt= new Details("hari", 28, 24);
		dt.showData();
		// TODO Auto-generated method stub

	}

}
