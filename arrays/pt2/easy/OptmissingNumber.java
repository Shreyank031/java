public class OptmissingNumber {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 5, 6 };
		int n = 6;
		System.out.println(miss(array, n));
	}

	static int miss(int[] arr, int n) {

		int j = arr.length - 1;
		int N = arr[j];

		int sum = (N * (N + 1)) / 2;

		int s2 = 0;
		for (int i = 0; i < n - 1; i++) {

			s2 += arr[i];
		}
		sum -= s2;

		return sum;

	}
}
//72AAbb(*)

