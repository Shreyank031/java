import java.util.*;

public class rotateArraybyN {
	public static void main(String[] args) {
		// Original array
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		// number of position to shift
		int n = 3;

		System.out.println(Arrays.toString(rot(arr, n)));
	}

	static int[] rot(int arr[], int n) {

		// Create a temporary array to store the first n elements
		int temp[] = new int[arr.length];

		// Copy the first n elements to the temporary array
		for (int i = 0; i < n; i++) {
			temp[i] = arr[i];
		}

		// Shift the remaining elements to the left by n positions
		for (int i = n; i < arr.length; i++) {
			arr[i - n] = arr[i];
		}

		// Copy the elements from the temporary array to the end of the original array
		for (int i = arr.length - n; i < arr.length; i++) {
			// Adjust the index of the temporary array to match the remaining positions in
			// array arr
			arr[i] = temp[i - n - 1];
		}
		return arr; // Return the rotated array
	}

}
