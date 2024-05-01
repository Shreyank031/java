import java.util.*;

public class sort1 {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();

		// Create an array of the specified size to store the elements
		int[] array = new int[size];

		// Prompt the user to enter the elements of the array
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}

		// Close the Scanner object to prevent resource leaks
		input.close();

		// Call the insert method to sort the array
		insert(size, array);
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
	}

	// Method to sort the array using selection sort algorithm
	static void insert(int size, int[] arr) {
		// Iterate through the array
		for (int i = 0; i <= size - 2; i++) {
			// Initialize the index of the minimum element to the current index
			int mini = i;

			// Iterate through the unsorted portion of the array
			for (int j = i; j <= size - 1; j++) {
				// If the current element is smaller than the current minimum,
				// update the index of the minimum element
				if (arr[mini] > arr[j]) {
					mini = j;
				}
			}

			// Swap the current element with the minimum element
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
		}

		// Print the sorted array
		System.out.println(Arrays.toString(arr));
	}
}
