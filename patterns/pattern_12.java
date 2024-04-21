import java.util.*;

public class pattern_12 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		pattern(in);
	}

	static void pattern(int in) {
		for (int i = 0; i < in; i++) {
			// numbers
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j);
			}
			// spaces
			for (int j = 0; j < 2 * (in - i - 1); j++) {
				System.out.print(" ");
			}

			// numbers
			for (int j = i + 1; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
