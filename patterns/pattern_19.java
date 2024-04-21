import java.util.*;

public class pattern_19 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		pattern(in);
	}

	static void pattern(int n) {
		int space = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			// for (int k = 0; k < i * 2; k++) {
			for (int k = 0; k < space; k++) {
				System.out.print(" ");
			}
			space += 2;
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}

			for (int k = 0; k < (n * 2) - (2 * i) - 2; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
