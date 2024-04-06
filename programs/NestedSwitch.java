import java.util.Scanner;

public class NestedSwitch {
    

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the employee number : ");
		int employee_no = in.nextInt();
		System.out.print("Enter the department name : ");
		String department = in.next();
		in.close();

		switch (employee_no) {
			case 1 -> System.out.println("Jake Jackson");
			case 2 -> System.out.println("James Allen");
			case 3 -> System.out.println("Santhos Vermios");
			case 4 -> {
				switch (department) {
					case "Finance" -> System.out.println("Finance Department");
					case "Management" -> System.out.println("Management Department");
					default -> System.out.println("Enter valid Department");

				}

		}	
		default -> System.out.println("Enter valid employee number");
	}
  }
}

