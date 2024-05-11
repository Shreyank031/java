import java.util.*;

public class largestElement {
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
		System.out.println(max(arr));
	}

	static int max(int[] array) {

		int largest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		return largest;
	}
}
