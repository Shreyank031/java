import java.util.*;

public class pattern_10 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		pattern(in);
	}

	static void pattern(int num) {
		for (int i = 0; i < num; i++) {
			int start = i;
			if (i > (num / 2)) {
				start = num - i - 1;
			}
			for (int j = 0; j < start + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
