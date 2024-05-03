import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = { 4, 21, 54, 2, 9, 212, 5, 12 };

        // Call the reverse method and print the result
        System.out.println(reverse(array, 8, 78));
        // System.out.println(reverse(array, , array.length-1));

        // reverse(array, 0, 0);
        // System.out.println(Arrays.toString(array));
    }

    // Method to reverse elements in the array
    static String reverse(int[] arr, int start, int end) {
        // Initialize the start and end indices
        start = 0;
        end = arr.length - 1;

        // Iterate through the array until start index is less than end index
        while (start < end) {
            // reverse elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move start index forward and end index backward
            start++;
            end--;
        }
        // Return the array as a string after swaping
        return Arrays.toString(arr);
    }
}
