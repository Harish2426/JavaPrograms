package Harish;
public class TestEmployee {

	public static void main(String[] args) {
		Employee ec= new Employee();
		ec.getId(1);
		ec.getName("harish");
		ec.getCity("Jamshedpur");
		System.out.println("employee id = " +ec.setId());
		System.out.println("employee name is = "+ec.setName());
		System.out.println("employee city is = "+ec.setCity());
	}

}
