package Harish;

public class ConsTest {
	int a;
	ConsTest(int a){
		this.a=a;		
	}
	void showData(){
		System.out.println("volume of cube "+(a*a*a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsTest tc= new ConsTest(23);
		tc.showData();

	}

}
