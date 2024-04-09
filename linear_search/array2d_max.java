import java.util.Arrays;

public class array2d_max {
	public static void main(String[] args) {
		// 2D array initialization
		int[][] array = {
				{ 4, 2, -9 },
				{ 78, 12, 101 },
				{ 3, 1 },
				{ -6, 88, 68 }
		};

		// Call the maxValue method and print the result
		System.out.println(maxValue(array));

		// Call the maxEnhancedValue method and print the result
		System.out.println(maxEnhancedValue(array));
	}

	// Method to find the maximum value in a 2D array using nested loops
	static int maxValue(int[][] arr) {
		// Initialize the maximum value to the minimum possible integer value
		int max = Integer.MIN_VALUE;

		// Iterate over each row of the 2D array
		for (int row = 0; row < arr.length; row++) {
			// Iterate over each element in the current row
			for (int col = 0; col < arr[row].length; col++) {
				// Update the maximum value if the current element is greater
				if (arr[row][col] > max) {
					max = arr[row][col];
				}
			}
		}
		// Return the maximum value found
		return max;
	}

	// Method to find the maximum value in a 2D array using enhanced for loop
	static int maxEnhancedValue(int[][] arr) {
		// Initialize the maximum value to the minimum possible integer value
		int max = Integer.MIN_VALUE;

		// Iterate over each row of the 2D array using enhanced for loop
		for (int[] ints : arr) {
			// Iterate over each element in the current row
			for (int element : ints) {
				// Update the maximum value if the current element is greater
				if (element > max) {
					max = element;
				}
			}
		}
		// Return the maximum value found
		return max;
	}
}
