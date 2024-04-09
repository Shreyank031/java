// Import the Scanner class to read user input
import java.util.Scanner;

// Define a public class named ar
public class armStrong {

    // The main method
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a three-digit number
        System.out.print("Enter the three-digit number: ");
        int n = in.nextInt(); // Read the user's input
        in.close(); // Close the Scanner object to release system resources

        // Call the arm_ method with the user's input, store the result in the variable ans
        boolean ans = arm_(n);

        // Print the result to the console
        System.out.println(ans);
    }

    // Define a static method named arm_ that checks if a given number is an Armstrong number
    static boolean arm_(int num) {
        // Store the original value of num for comparison later
        int original_val = num;

        // Variable to store the result of the Armstrong number calculation
        int result = 0;

        // Iterate through each digit of num and calculate the cube of each digit
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            int cube = rem * rem * rem;
            result += cube;
        }

        // Check if the original value is equal to the calculated result
        return original_val == result;
    }
}

