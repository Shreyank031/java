// Define a public class named add2
public class add2 {
    // The main method
    public static void main(String[] args) {
        // Call the sum method with arguments 2 and 10, store the result in variable su
        int su = sum(2, 10);
        // Print the result to the console
        System.out.println(su);
        System.out.println(su);
    }

    // Define a static method named sum that calculates the sum of two integers
    static int sum(int a, int b) {
        // Calculate the sum of the two integers and store it in a variable named summ
        int summ = a + b;
        // Return the calculated sum
        return summ;
    }
}
