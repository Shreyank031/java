import java.util.*;

public class pattern_6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int in = input.nextInt();
		input.close();

		pattern(in);
	}

	static void pattern(int in) {

		for (int i = 1; i <= in; i++) {
			for (int j = 1; j <= in - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
