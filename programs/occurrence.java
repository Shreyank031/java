import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input a number with duplicates
        System.out.print("Enter the number with duplicates : ");
        int n = in.nextInt();
        
        // Prompt the user to input the number they want to find occurrences of
        System.out.print("Enter the number you want to find : ");
        int num = in.nextInt();
		in.close();

        // Initialize a variable count to keep track of the occurrences of the specified number
        int count = 0;
        
        // Iterate through the digits of the input number to count occurrences of the specified number
        while (n > 0) {
            // Extract the rightmost digit of the input number
            int reminder = n % 10;
            
            // Check if the extracted digit matches the specified number
            if (reminder == num) {
                // Increment the count if there is a match
                count++;
            }
            
            // Remove the rightmost digit from the input number
            n = n / 10;
        }
        
        // Display the count of occurrences of the specified number within the input number
        System.out.println("The number " + num + " occurs " + count + " times");
    }
}
