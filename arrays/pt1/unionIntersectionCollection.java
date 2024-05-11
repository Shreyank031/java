import java.util.*;

public class temp {
	public static void main(String[] args) {

		int[] num1 = { 1, 3, 0, 4, 3, 5, 2 };
		int[] num2 = { 2, 1, 7, 3, 0, 9, 8 };
		int m = num1.length - 1;
		int n = num2.length - 1;
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		tt(num1, num2, m, n);
	}

	static void tt(int[] arr1, int[] arr2, int m, int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arrr = new ArrayList<>();

		for (int i : arr1) {
			arr.add(i);
		}
		for (int i : arr2) {
			arrr.add(i);
		}
		Collections.sort(arr);
		Collections.sort(arrr);
		ArrayList<Integer> array = new ArrayList<>(arr);
		array.addAll(arrr);
		System.out.println(array);
		System.out.println("After sorting the array: ");
		Collections.sort(array);
		System.out.println(array);

		Set<Integer> set = new HashSet<>(array);
		array.clear();
		array.addAll(set);
		System.out.println(set);

		Set<Integer> interSet = new HashSet<>(arr);
		interSet.retainAll(arrr);
		System.out.println(interSet);

	}

}
