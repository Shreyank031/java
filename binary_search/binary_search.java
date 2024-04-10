public class binary_search {
	public static void main(String[] args) {
		int[] array = { -2, 0, 3, 5, 7, 12, 18, 22, 23, 31, 49 };
		// int[] array = { 23, 19, 13, 12, 7, 5, 3, 2, 1, 0, -3 };
		int target = 23;

		int index = binarySearch(array, target);

		System.out.println(index);
	}

	static int binarySearch(int[] arr, int target) {
		int start = 0; // Initialize start index
		int end = arr.length; // Initialize end index

		// Perform binary search until start index is less than or equal to end index
		while (start <= end) {
			int mid = start + (end - start) / 2; // Calculate middle index

			// If the middle element is greater than the target, update end index
			if (arr[mid] > target) {// if (arr[mid] < target) {
				end = mid - 1;
			}
			// If the middle element is less than the target, update start index
			else if (arr[mid] < target) {// else if (arr[mid] > target) {
				start = mid + 1;
			}
			// If the middle element is equal to the target, return its index
			else {
				return mid;
			}
		}
		// If target is not found, return -1
		return -1;
	}
}
