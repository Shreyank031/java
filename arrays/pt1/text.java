import java.sql.Array;
import java.util.*;

public class test {

	public static void main(String args[]) {

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

		int m = arr1.length;
		int n = arr2.length;

		System.out.println("Below are the two given arrays: ");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		Union(arr1, m, arr2, n);
	}

	static void Union(int[] arr1, int m, int[] arr2, int n) {
		ArrayList<Integer> array = new ArrayList<>();
		for (int i : arr2) {
			array.add(i);

		}
		Set<Integer> set = new HashSet<>(array);
		int[] arr = new int[set.size()];
		int j = 0;
		for (int i : set) {
			arr[j++] = i;
		}

		System.out.println(array);
		System.out.println(set);
		System.out.println("Array");
		System.out.println(Arrays.toString(arr));
	}
}
