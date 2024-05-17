public class twoSumArray {

	public static void main(String[] args) {
		

		int[] arr = { 2, 6, 5, 8, 9 };
		int k = 17;
		System.out.println(Sub(arr, k));
	}

	static boolean Sub(int[] array, int k) {

		int n = array.length;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (array[i] + array[j] == k) {
					return true;
				}
			}

		}
		return false;
	}
}
// O(N^2) -> 2 loops.loop inside a loop
