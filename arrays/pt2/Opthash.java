import java.util.*;

class Opthash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter the size of an array: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.printf("Enter the element of an array of size " + n + ": ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// precompute:
		HashMap<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < n; i++) {
			hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
		}

		int q;
		System.out.print("Enter the query length: ");
		q = sc.nextInt();
		System.out.print("Enter the query element: ");
		while (q-- != 0) {
			int number;
			number = sc.nextInt();
			// fetching:
			System.out.println(hash.getOrDefault(number, 0));
		}
		sc.close();
	}
}
