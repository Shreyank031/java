public class linear_search {
	public static void main(String[] args) {

		int[] array = { 2, 54, 12, 99, -2, 8, 232, 65, -37 };
		int target = -2;
		int ans = linearSearch(array, target); // index will returned
		System.out.println(ans);
	}

	static int linearSearch(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;
		}

		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		return -1;
	}
}
