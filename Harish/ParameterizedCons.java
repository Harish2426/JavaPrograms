package Harish;

public class ParameterizedCons {
int id; String name;
//parameterized constructor
ParameterizedCons (int i, String n){
	id=i;
	name=n;
}
void showData() {
	System.out.println("id:"+id +" name:"+ name);
}
public static void main(String[] args) {
	ParameterizedCons ca=new ParameterizedCons(11,"abc");
	ca.showData();
}
}