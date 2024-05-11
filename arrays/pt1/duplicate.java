import java.util.*;

public class duplicate {
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
		int ans = dup(arr);
		System.out.print("New length: " + ans);
		System.out.println();
		for (int i = 0; i < ans; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static int dup(int[] arr) {
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				arr[j + 1] = arr[i];
				j++;
			}
		}
		return j + 1;
	}
}
