import java.util.*;

public class insertionSort {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		input.close();

		insert(size, array);
		System.out.println(Arrays.toString(array));
	}

	static void insert(int n, int[] arr) {

		for (int i = 0; i < n; i++) { // n is size

			int j = i;

			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
}
// tc = O(N^2)
// BestCase = O(N) -> when it's already sorted. It won't go inside while loop.
// only one loop runs.
