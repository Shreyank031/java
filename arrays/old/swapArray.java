import java.util.*;

public class swapArray {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first index number: ");
        // Read the first index number from the user
        int index1 = input.nextInt();

        // Create another scanner object to read the second index number
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the second index number: ");
        // Read the second index number from the user
        int index2 = in.nextInt();

        // Define an array of integers
        int[] array = { 1, 4, 2, 55, 32, 99, 123 };
        System.out.println("\nBefore Swap -> " + Arrays.toString(array));

        // Call the swap method to swap elements at the specified indices
        swap(array, index1, index2);

        // Close the scanners to release system resources
        in.close();
        input.close();

        // Print the array after swapping
        System.out.println("\nAfter Swap -> " + Arrays.toString(array));

    }

    // Method to swap elements in an array at the specified indices
    static void swap(int[] arr, int index_1, int index_2) {
        // Store the value at the first index in a temporary variable
        int temp = arr[index_1];
        // Assign the value at the second index to the first index
        arr[index_1] = arr[index_2];
        // Assign the value stored in the temporary variable to the second index
        arr[index_2] = temp;
    }
}
