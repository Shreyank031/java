// Define a public class named arm
public class arm {

    // The main method
    public static void main(String[] args) {
        // Iterate through numbers from 100 to 999
        for (int i = 100; i < 1000; i++) {
            // Check if the current number is an Armstrong number
            if (arm_(i)) {
                // If true, print the Armstrong number
                System.out.print(i + " ");
            }
        }
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


