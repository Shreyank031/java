import java.util.*;

public class pattern_17 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		pattern(in);
	}

	static void pattern(int n) {
		// outer loop(rows)
		for (int i = 0; i < n; i++) {
			// spaces
			for (int j = 0; j < n - (i - 1); j++) {
				System.out.print(" ");
			}
			// alphabets
			char ch = 'A';
			int breakpoint = ((2 * i) + 1) / 2;
			for (int j = 0; j < (2 * i) + 1; j++) {
				System.out.print(ch);
				if (j < breakpoint) {
					ch++;
				} else {
					ch--;
				}
			}
			for (int j = 0; j < n - (i - 1); j++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}
}
