import java.util.*;

public class divisorImproved {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		input.close();
		printDevisor(inp);
	}

	static void printDevisor(int num) {

		ArrayList<Integer> arr = new ArrayList<>();

		// for (int i = 1; i <= Math.sqrt(num); i++) {
		for (int i = 1; i * i <= num; i++) { // O(sqrt(num)
			if (num % i == 0) {
				arr.add(i);
			}
			if (num / i != i) {
				arr.add(num / i);
			}
		}
		Collections.sort(arr); // O(num of factors * log(num of factors))

		for (int i : arr) { // O(num of factors)
			System.out.println(i);

		}
	}
}
