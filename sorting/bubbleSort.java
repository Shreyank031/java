import java.util.*;

public class bubbleSort {
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

		int length = n - 1;
		int didSwap = 0;
		for (int i = length; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
					didSwap += 1;
				}

			}

			if (didSwap == 0) {
				break;
			}
			System.out.println("swap");
		}

	}
}
