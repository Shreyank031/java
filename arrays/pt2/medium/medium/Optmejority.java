import java.util.*;

public class Optmejority {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 3, 3, 1, 2, 2 };
		int size = arr.length;
		System.out.println(Sub(arr, size));
	}

	static int Sub(int[] arr, int n) {

		HashMap<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < n; i++) {

			hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1); // {2:4, 3:2, 1:1}
		}
		// for (int i = 0; i < n; i++) {
		// int j = hash.getOrDefault(arr[i], 0);
		// if (j > n / 2) {
		// return j;
		// }
		// }
		for (int value : arr) {
			int j = hash.getOrDefault(value, 0);
			if (j > n / 2) {
				return j;
			}
		}
		return -1;
	}
}
// O(2N)
