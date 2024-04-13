import java.util.Arrays;

public class leet {
	public static void main(String[] args) {
		int[] array = { 5, 7, 7, 7, 8, 8, 10 };
		int target = 7;

		System.out.println(Arrays.toString(searchRange(array, target)));
	}

	// Function to find the starting and ending positions of the target number in
	// the sorted array
	static int[] searchRange(int[] arr, int target) {
		// Initialize the answer array with default values
		int[] ans = { -1, -1 };

		// Find the starting and ending positions of the target
		int start = search(arr, target, true);
		int end = search(arr, target, false);

		// Update the answer array with the starting and ending positions
		ans[0] = start;
		ans[1] = end;

		// Return the answer array
		return ans;
	}

	// Binary search function to find the starting or ending position of the target
	static int search(int[] arr, int target, boolean findStartIndex) {
		// Initialize the answer variable
		int ans = -1;
		// Initialize the start and end pointers for binary search
		int start = 0;
		int end = arr.length - 1;

		// Binary search loop
		while (start <= end) {
			// Calculate the middle index
			int mid = start + (end - start) / 2;

			// Check if the target is greater than the element at the middle index
			if (target > arr[mid]) {
				// If yes, update the start pointer to search in the right half of the array
				start = mid + 1;
			}
			// Check if the target is less than the element at the middle index
			else if (target < arr[mid]) {
				// If yes, update the end pointer to search in the left half of the array
				end = mid - 1;
			}
			// If the target is found at the middle index
			else {
				// Update the answer with the middle index
				ans = mid;
				// If finding the starting index of the target
				if (findStartIndex) {
					// Update the end pointer to search for the target in the left half of the array
					end = mid - 1;
				}
				// If finding the ending index of the target
				else {
					// Update the start pointer to search for the target in the right half of the
					// array
					start = mid + 1;
				}
			}
		}

		// Return the answer
		return ans;
	}
}
