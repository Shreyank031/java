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

		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				temp.add(arr[i]);
			}
		}

		int size = temp.size();
		for (int i = 0; i < size; i++) {
			arr[i] = temp.get(i);
		}

		for (int i = temp.size(); i < n; i++) {
			arr[i] = 0;
		}
		return arr;

	}
}
