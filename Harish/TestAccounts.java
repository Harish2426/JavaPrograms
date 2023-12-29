package Harish;

public class TestAccounts {

	public static void main(String[] args) {
		Accounts ac=new Accounts();
		ac.getAcc_no(123456789);
		ac.getName("harish");
		ac.getEmail("harish@gmail.com");
		ac.getAcc_bal(1000000);
		ac.getAge(18);
		System.out.println("AccNo = " +ac.setAcc_no());
		System.out.println("AccHolderName =" +ac.setName());
		System.out.println("AccHolderEmail = " +ac.setEmail());
		System.out.println("AccBalance = " +ac.setAcc_bal());
		System.out.println("Holder Age = " +ac.setAge());

	}

}
