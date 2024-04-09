import java.util.Scanner;

// Import Scanner class to read user input

public class stch {
    // Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object to read user input
        System.out.print("Enter the number from 1 to 7 : "); // Prompt the user to enter a number from 1 to 7
        int dayNum = in.nextInt(); // Read the input number
        in.close(); // Close the Scanner object to release system resources

        // Use a switch statement (with arrow syntax introduced in Java 14) to categorize the day based on the number
        switch (dayNum) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays"); // If dayNum is 1, 2, 3, 4, or 5, print "Weekdays"
            case 6, 7 -> System.out.println("Weekends"); // If dayNum is 6 or 7, print "Weekends"
            default -> System.out.println("Invalid day number"); // If dayNum doesn't match any case, print "Invalid day number"
																	
			//			In kotlin we use "when" which is similar to using switch in java"
//			when(dayNum) {
//				12 -> println("It is number twelve")
//				"dog" -> println("The animal is a dog")
//				else -> println("Neither number nor a animal")

        }
    }
}

