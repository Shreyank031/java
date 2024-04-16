import java.util.*;

public class smallestLetterGtarget {
	public static void main(String[] args) {
		char[] array = { 'a', 'b', 'k', 'm', 'p', 's', 'u' };
		char target = 'u';
		System.out.println(array.length);
		System.out.println(smallestLetter(array, target));
		// smallest number greater than target and letters wrap around
	}

	static char smallestLetter(char[] arr, char target) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return arr[start % arr.length];
	}
}
