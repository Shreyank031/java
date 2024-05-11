import java.util.*;

public class optRotateArraybyN {
	public static void main(String[] args) {
		// Original array
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		// number of position to shift
		int k = 3;
		int n = arr.length;

		System.out.println(Arrays.toString(rot(arr, k, n)));
	}

	static int[] rot(int[] arr, int k, int n) {
		int start;
		int end;
		rotate(arr, 0, k - 1);
		rotate(arr, k, n - 1);
		rotate(arr, 0, n - 1);
		return arr;
	}

	static int[] rotate(int[] arr, int start, int end) {

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;

	}

}
