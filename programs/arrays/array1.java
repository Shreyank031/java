// Import the Scanner class
import java.util.Scanner;

// Define a public class named array1
public class array1 {

    // The main method
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Declare an array of integers named ar with a length of 5
        int ar[] = new int[5];
		System.out.print("Enter 5 integers : ");

        // Prompt the user to enter 5 integer values and store them in the array
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt(); // Read the user's input and assign it to the array element
        }

        // Close the Scanner object to release system resources
        in.close();

        // Print the elements of the array separated by a space
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
