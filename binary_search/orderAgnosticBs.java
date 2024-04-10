public class orderAgnosticBs {
	public static void main(String[] args) {
		int[] array = { -2, 0, 3, 5, 7, 12, 18, 22, 23, 31, 49 }; // ascending
		int[] arrayy = { 23, 19, 13, 12, 7, 5, 3, 2, 1, 0, -3 }; // descending
		int target = 3;

		int index = orderAgnoBs(arrayy, target);

		System.out.println(index);
	}

	static int orderAgnoBs(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		// check whether the array is sroted in ascending or descending order
		boolean isAscending = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}

			if (isAscending) {
				if (arr[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {

				if (arr[mid] < target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
