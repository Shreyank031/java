// Import the Arrays and Scanner classes
import java.util.Arrays;
import java.util.Scanner;

// Define a public class named array
public class array {

    // The main method
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Declare an array of Strings named arg with a length of 4
        String[] arg = new String[4];
		System.out.print("Enter the string with length 4 : ");

        // Prompt the user to enter 4 String values and store them in the array
        for (int i = 0; i < arg.length; i++) {
            arg[i] = in.next(); // Read the user's input and assign it to the array element
        }

        // Close the Scanner object to release system resources
        in.close();

        // Print the elements of the array using Arrays.toString
        System.out.println(Arrays.toString(arg));
    }
}
