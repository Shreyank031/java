import java.util.*;

public class union2ArrayWithArrayList {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 5, 8, 10, 11, 12 };
		int[] arr2 = { 1, 3, 5, 6, 9, 11, 14 };

		int m = arr1.length;
		int n = arr2.length;

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		System.out.println(union(arr1, arr2, m, n));
	}

	static ArrayList union(int[] arr1, int[] arr2, int m, int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				arr.add(arr1[i++]);
			} else if (arr2[j] < arr1[i]) {
				arr.add(arr2[j++]);
			} else {
				arr.add(arr2[j++]);
				i++;
			}
		}
		while (i < m) {
			arr.add(arr1[i++]);
		}
		while (j < n) {
			arr.add(arr2[j++]);
		}
		return arr;
	}
}
