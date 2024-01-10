import java.util.Scanner;

// Define the main class
public class switchh2 {
    // Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object to read user input
        System.out.print("Enter the name of fruit : "); // Prompt the user to enter a fruit name
        String fruit = in.next(); // Read the input fruit name
        in.close(); // Close the Scanner object to release system resources
        
        // Use a switch statement (with arrow syntax introduced in Java 14) to determine characteristics based on the fruit name
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits"); // If fruit is "Mango", print "King of fruits"
            case "Grapes" -> System.out.println("Tiny fruit"); // If fruit is "Grapes", print "Tiny fruit"
            case "Apple" -> System.out.println("Expensive fruit"); // If fruit is "Apple", print "Expensive fruit"
            case "Orange" -> System.out.println("Tangy fruit"); // If fruit is "Orange", print "Tangy fruit"
			default -> System.out.println("Enter the valid fruit name!");
        }	
    }
}
