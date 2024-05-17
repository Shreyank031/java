public class missingNumber {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 5, 6 };
		int n = 6;
		System.out.println(miss(array, n));
	}

	static int miss(int[] arr, int n) {

		for (int i = 1; i < n; i++) {
			int flag = 0;
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] == i) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				return i;
			}
		}
		return -1;
	}
}
