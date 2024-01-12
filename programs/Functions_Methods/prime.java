// Import the Scanner class to read user input
import java.util.Scanner;

// Define a public class named prime
public class prime {
    // The main method
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int prime = in.nextInt(); // Read the user's input
        in.close(); // Close the Scanner object to release system resources

        // Call the bool_ method with the user's input, store the result in the variable result
        boolean result = bool_(prime);

        // Print the result to the console
        System.out.println(result);
    }

    // Define a static method named bool_ that checks if a given number is prime
    static boolean bool_(int num) {
        // If the number is less than or equal to 1, it's not prime
        if (num <= 1) {
            return false;
        }

        int c = 2;

        // Check divisibility up to the square root of num
        while (c * c <= num) {
            // If num is divisible by c, it's not prime
            if (num % c == 0) {
                return false;
            }
            c++;
        }

        // If no divisors were found, the number is prime
        return c * c >= num;
    }
}


