import java.util.*;

public class move0toEnd {
	public static void main(String[] args) {
		// Original array
		int arr[] = { 1, 0, 3, 0, 7, 0, 5 };
		// number of position to shift
		int n = arr.length;

		System.out.println(Arrays.toString(rot(arr, n)));
	}

	static int[] rot(int[] arr, int n) {

		// find the the first occurance of zero and store it's index in j(first pointer)
		int j = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}

		for (int i = j + 1; i < n; i++) {
			if (arr[i] != 0) {
				// swap if the ar element not equal to 0
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++; // don't forget to increment j after swaping
			}
		}
		return arr;
	}
}
