import java.util.*;

public class functionalRec {
	// sum of first n numbers using recursion with return statement
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input: ");
		int num = input.nextInt();
		input.close();
		System.out.println(recc(num));
	}

	static int recc(int n) {

		if (n == 0) {
			return 0;
		} else {
			return n + recc(n - 1);
		}
	}
}
