import java.util.*;

public class ceiling_no {
	public static void main(String[] args) {
		int[] array = { -2, 0, 3, 5, 7, 12, 18, 22, 23, 31, 49 };
		// int[] array = { 23, 19, 13, 12, 7, 5, 3, 2, 1, 0, -3 };

		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();

		int index = binarySearch(array, in);

		System.out.println(index);
	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				return arr[mid];
			}
		}
		return arr[start];
	}
}
