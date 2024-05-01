import java.util.*;

public class functionalRec1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input: ");
		int num = input.nextInt();
		input.close();
		System.out.println(recc(num));
		int sum = 1;
		rec(num, sum);
	}

	// factorial of a number using recursion with return statement
	static int recc(int n) {

		if (n == 0) {
			return 1; // make sure you return 1 not 0 because anything multiplyed by 0 is 0
		} else {
			return n * recc(n - 1);
		}
	}

	// factorial of a number using parameterised recursion
	static void rec(int n, int sum) {

		if (n == 0) {
			System.out.println(sum);
			return;
		}
		rec(n - 1, sum * n);

	}
}
