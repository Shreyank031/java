import java.util.*;

public class secondSmallest {

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
		System.out.println(sSmallest(arr));
		// what if i want to return an array
		int ar[] = new int[] { sSmallest(arr) };
		System.out.println(Arrays.toString(ar));
	}

	static int sSmallest(int[] arr) {

		int smallest = arr[0];
		int ssmallest = Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				ssmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] > smallest && arr[i] < ssmallest) {
				ssmallest = arr[i];
			}
		}
		return ssmallest;
	}
}
