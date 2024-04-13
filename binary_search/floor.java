import java.util.*;

public class floor {
	public static void main(String[] args) {
		int[] array = { -2, 0, 3, 5, 7, 12, 18, 22, 23, 31, 49 };
		// int target = -3;
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int target = input.nextInt();
		input.close();

		int index = floorSearch(array, target);

		System.out.println(index);
	}

	static int floorSearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				return arr[mid];
			}
		}
		return arr[end];
	}
}
