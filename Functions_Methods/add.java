// Import the Scanner class to read user input
import java.util.Scanner;

// Define a public class named add
public class add {
    // The main method
    public static void main(String[] args) {
        int s = sum(); // Call the sum method and store the result in variable s
        System.out.println(s); // Print the result to the console
    }

    // Define a static method named sum, which calculates the sum of two numbers
    static int sum() {
        Scanner in = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.print("Enter number number 1 and 2 : "); // Prompt the user to enter two numbers
        int num_1 = in.nextInt(); // Read the first number
        int num_2 = in.nextInt(); // Read the second number
        in.close(); // Close the Scanner object to release system resources

        int sum = num_1 + num_2; // Calculate the sum of the two numbers
        return sum; // Return the calculated sum
    }
}
