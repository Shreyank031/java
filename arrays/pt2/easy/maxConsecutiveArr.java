public class maxconsecutiveArr {
	public static void main(String[] args) {

		int[] array = { 1, 1, 1, 3, 1, 2, 1, 8, 8 };
		int n = array.length;
		System.out.println(miss(array, n));
	}

	static int miss(int[] arr, int n) {

		int max = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			max = Math.max(max, count);
		}
		return max;
	}
}
