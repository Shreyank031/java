import java.util.*;

public class pattern_5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int in = input.nextInt();
		input.close();

		pattern(in);
	}

	static void pattern(int in) {

		for (int i = 0; i < in; i++) {
			// for (int j = in; j > i; j--) {
			for (int j = 0; j < in - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
