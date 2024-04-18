import java.util.*;

public class pattern_11 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		pattern(in);
	}

	static void pattern(int num) {
		for (int i = 0; i < num; i++) {
			int start;
			if (i % 2 == 0) {
				start = 1;
			} else {
				start = 0;
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}
	}
}
