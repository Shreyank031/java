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
		int num = 1;
		for (int i = 1; i <= in; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(num + " ");
				num += 1;
			}
			System.out.println();

		}
	}
}
