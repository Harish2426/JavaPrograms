package Harish;
/*Create a class "Accounts" 
 * having private attributes acc_no, name,email, acc_bal.
 */
public class Accounts {
	private int acc_no;
	private String name;
	private String email;
	private int acc_bal;
	private int age;
	void getAcc_no(int acc_no) {
		this.acc_no=acc_no;
	}
	int setAcc_no()
	{
		return acc_no;
	}
	void getName(String name) {
		this.name=name;
	}
	String setName() {
		return name;
	}
    void getEmail(String email) {
    	this.email=email;
    }
    String setEmail() {
    	return email;
    }
    void getAcc_bal(int acc_bal) {
    	this.acc_bal=acc_bal;
    }
    int setAcc_bal() {
    	return acc_bal;
    }
    void getAge(int age) {
    	this.age=age;
    }
    boolean setAge() {
    	if (this.age>18) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
