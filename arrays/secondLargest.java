import java.util.*;

public class secondLargest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int in = input.nextInt();
		System.out.print("Enter the array elements: ");
		int arr[] = new int[in];
		for (int i = 0; i < in; i++) {
			arr[i] = input.nextInt();
		}
		input.close();
		int result = max(arr);
		System.out.println(second(arr, result));

	}

	static int max(int[] arr) {

		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

	static int second(int[] arr, int largest) {

		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
}
