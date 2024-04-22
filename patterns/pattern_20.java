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

		int spaces = (2 * n) - 2;
		for (int i = 1; i <= (2 * n) - 1; i++) {
			int stars = i;
			if (i > n) {
				stars = (2 * n) - i;
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < n) {
				spaces -= 2;
			} else { // else {space-=2;}
				spaces += 2;
			}
		}
	}
}
