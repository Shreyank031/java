import java.util.*;

public class pattern_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int in = input.nextInt();
		input.close();

		pattern(in);
	}

	static void pattern(int in) {

		for (int i = 0; i < in; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
