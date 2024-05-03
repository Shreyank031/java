import java.util.*;

public class binarySearchRec {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int[] array = new int[size];

		System.out.print("Enter the elements of the array: ");// make sure the input is sorted
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}

		System.out.print("Enter the target element : ");
		int target = input.nextInt();
		input.close();

		int low = 0;
		int high = size - 1;
		int ans = insert(array, target, high, low);
		if (ans == -1) {
			System.out.println("Oopsy! Element not found");
		} else {

			System.out.println("It is present at the index " + ans);
		}
	}

	static int insert(int[] arr, int target, int high, int low) {

		if (low > high) {
			return -1;
		}

		int mid = low + (high - low) / 2; // (mid = 2low + high - low)/2 -> (low +high)/2
		if (target == arr[mid]) {
			return mid;
		} else if (target > arr[mid]) {
			return insert(arr, target, high, mid + 1);
		} else {
			return insert(arr, target, mid - 1, low);
		}
	}
}
// TC -> O(log_base2(N))
