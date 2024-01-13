import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input a number
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        
        // Close the Scanner object to free up resources
        in.close();
        
        // Store the original number in a separate variable for display purposes
        int numm = num;	

        // Initialize a variable 'result' to store the reversed number
        int result = 0;
        
        // Reverse the number by extracting its digits and building the reversed number
        while (num > 0) {
            // Extract the rightmost digit of 'num'
            int rem = num % 10;
            
            // Remove the rightmost digit from 'num'
            num /= 10;
            
            // Build the reversed number by multiplying the existing result by 10 and adding the extracted digit
            result = (result * 10) + rem; 
        }

        // Display the original number and its reversed form
        System.out.println("The reverse of " + numm + " is " + result);
    }
}
