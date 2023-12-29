package Jdbc;
import java.util.Scanner;
public class DashboardProgram {
	

//	public class DashboardProgram {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Welcome to Dashboard");
	            System.out.println("=====================================");
	            System.out.println("1. Select 1 for User");
	            System.out.println("2. Select 2 for Product");
	            System.out.println("3. Select 3 for Cart");
	            System.out.println("4. Select 4 for Order");
	            System.out.println("5. Select 5 for Exit");

	            int mainChoice = scanner.nextInt();

	            switch (mainChoice) {
	                case 1:
	                    userSection(scanner);
	                    break;
	                case 2:
	                    productSection(scanner);
	                    break;
	                case 3:
	                    cartSection(scanner);
	                    break;
	                case 4:
	                    orderSection(scanner);
	                    break;
	                case 5:
	                    System.out.println("Exited Successfully...");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void userSection(Scanner scanner) {
	        while (true) {
	            System.out.println("1. Select 1 Add User");
	            System.out.println("2. Select 2 Delete User");
	            System.out.println("3. Select 3 Update User");
	            System.out.println("4. Select 4 to Show All User");
	            System.out.println("5. Select 5 to Show Any User");
	            System.out.println("6. Select 6 for Exit");

	            int userChoice = scanner.nextInt();

	            switch (userChoice) {
	                case 1:
	                    System.out.println("Add User...");
	                    // Add user logic here
	                    break;
	                case 2:
	                    System.out.println("Delete User...");
	                    // Delete user logic here
	                    break;
	                case 3:
	                    System.out.println("Update User...");
	                    // Update user logic here
	                    break;
	                case 4:
	                    System.out.println("Show All User...");
	                    // Show all user logic here
	                    break;
	                case 5:
	                    System.out.println("Show Any User...");
	                    // Show any user logic here
	                    break;
	                case 6:
	                    System.out.println("Exited from User Section Successfully...");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void productSection(Scanner scanner) {
	        // Similar structure as userSection method
	    }

	    private static void cartSection(Scanner scanner) {
	        // Similar structure as userSection method
	    }

	    private static void orderSection(Scanner scanner) {
	        // Similar structure as userSection method
	    }
	}
