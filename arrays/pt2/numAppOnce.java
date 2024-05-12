public class numAppOnce {
	public static void main(String[] args) {

		int[] array = { 1, 1, 5, 5, 3, 3, 8, 9, 9 };
		int n = array.length;
		System.out.println(miss(array, n));
	}

	static int miss(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int count = 0;
			int num = arr[i];
			for (int j = 0; j < n; j++) {
				if (arr[j] == num) {
					count++;
				}
			}
			if (count == 1) {
				return num;
			}
		}

		return -1;
	}
}
