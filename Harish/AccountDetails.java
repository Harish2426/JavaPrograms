package Harish;
/*Write a Java program to create a class called 
 * "AccountDetails" having attributes Acc_holder,
 *  Acc_num, Adhar_num and Acc_bal. Use the Final keyword 
 *  for appropriate variable. */
public class AccountDetails {
	final long Adhar_num;
	int Acc_bal;
	int Acc_num; 
AccountDetails(){
	             Adhar_num = 1234567890;
                }
void show(int a,int f )
	           {
		         Acc_num=a;
	             Acc_bal=f;
		         System.out.println("account no = "+a);
		         System.out.println("account bal = "+f);
		         System.out.println("account bal = "+Adhar_num);
	           }
	
	public static void main(String[] args) 
	{
	AccountDetails ac= new AccountDetails();
	ac.show(123, 10);
	}
}
