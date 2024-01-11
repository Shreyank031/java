// Import the Scanner class to read user input
import java.util.Scanner;

// Define a public class named person
public class person {
    // The main method
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name : ");
        String str = in.nextLine(); // Read the user's name
        in.close(); // Close the Scanner object to release system resources

        // Call the myGreet method with the user's name, store the result in variable person
        String person = myGreet(str);

        // Print the greeting to the console
        System.out.println(person);
    }

    // Define a static method named myGreet that takes a name parameter and returns a greeting message
    static String myGreet(String name) {
        // Create a greeting message by concatenating "Hello" and the provided name
        String msmc = "Hello " + name;

        // Return the greeting message
        return msmc;
    }
}
