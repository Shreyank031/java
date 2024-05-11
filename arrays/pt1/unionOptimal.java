import java.util.*;

public class unionOptimal {

	public static void main(String args[]) {

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

		int m = arr1.length;
		int n = arr2.length;

		System.out.println("Below are the two given arrays: ");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		ArrayList<Integer> Union = FindUnion(arr1, m, arr2, n);
		System.out.println(Union);
	}

	static ArrayList<Integer> FindUnion(int[] arr1, int m, int[] arr2, int n) {

		int i = 0;
		int j = 0;

		ArrayList<Integer> Union = new ArrayList<>();

		while (i < m && j < n) {
			if (arr1[i] <= arr2[j]) {

				if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
					Union.add(arr1[i++]);
				}
			} else {
				if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
					Union.add(arr2[j++]);
				}
			}
		}
		while (i < m) {
			if (Union.get(Union.size() - 1) != arr1[i]) {
				Union.add(arr1[i]);
			}
		}
		while (j < n) {
			if (Union.get(Union.size() - 1) != arr2[j]) {
				Union.add(arr2[j]);

			}
		}

		return Union;
	}
}
