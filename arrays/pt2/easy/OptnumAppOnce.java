public class numAppOnce {
	public static void main(String[] args) {

		/*
		 * Every number appears twice or even(times) except the one element.You need to
		 * find
		 * that one
		 * element.
		 */

		int[] array = { 1, 1, 5, 5, 3, 3, 8, 9, 9 };
		int n = array.length;
		System.out.println(miss(array, n));
	}

	static int miss(int[] arr, int n) {
		int xorr = 0;
		for (int i = 0; i < n; i++) {
			xorr = xorr ^ arr[i];
		}

		return xorr;
	}
}
