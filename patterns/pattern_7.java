import java.util.*;

public class pat7 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		pattern(in);
	}

	static void pattern(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j2 = 0; j2 < 2 * i + 1; j2++) {
				System.out.print("*");
			}
			for (int k = 0; k < num - i - 1; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
