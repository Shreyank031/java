import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Initialize the variable 'result' to store the calculated result
        int result = 0;

        // Continuously prompt for operator input until 'X' or 'x' is entered to exit
        while (true) {
            System.out.print("Enter the operator : ");
            // Read the operator character from user input
            char ch = in.next().trim().charAt(0);

            // Check if the entered character corresponds to a valid arithmetic operator
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.print("Enter the two numbers : ");
                // Read the two numbers from the user
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                // Perform the arithmetic operation based on the operator entered
                if (ch == '+') {
                    result = num1 + num2;
                }
                if (ch == '-') {
                    result = num1 - num2;
                }
                if (ch == '*') {
                    result = num1 * num2;
                }
                if (ch == '/') {
                    // Check if dividing by zero is attempted
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                }
                if (ch == '%') {
                    result = num1 % num2;
                }
            } else if (ch == 'X' || ch == 'x') {
                // Exit the loop if 'X' or 'x' is entered
                break;
            } else {
                // Display a message for invalid operators
                System.out.println("Invalid operator");
            }
            // Print the result of the operation
            System.out.println(result);
        }
        // Close the Scanner object
        in.close();
    }
}
