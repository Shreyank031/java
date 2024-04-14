import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		// int[] array = { -1 };
		int[] array = { -1, 2, 8, -6, 3 };

		int k = 2;

		System.out.println("Original Array: " + Arrays.toString(array));

		rotateArray(array, k);

		System.out.println("Rotated Array: " + Arrays.toString(array));
	}

	static void rotateArray(int[] nums, int k) {
		// No need to rotate for single-element array
		if (nums.length <= 1) {
			return;
		}

		// Calculate the effective rotation steps
		k = k % nums.length;
		int n = nums.length;

		// Reverse the entire array
		reverse(nums, 0, n - 1);

		// Reverse the first k elements
		reverse(nums, 0, k - 1);

		// Reverse the remaining elements
		reverse(nums, k, n - 1);
	}

	static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
