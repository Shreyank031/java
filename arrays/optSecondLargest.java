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
		System.out.println(sLargest(arr));
	}

	static int sLargest(int[] arr) {

		int largest = arr[0];
		int slargest = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				slargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > slargest) {
				slargest = arr[i];
			}
		}
		return slargest;
	}
}
