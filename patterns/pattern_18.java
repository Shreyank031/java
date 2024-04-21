import java.util.*;

public class pattern_18 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		pattern(in);
	}

	static void pattern(int in) {
		for (int i = 0; i < in; i++) {
			for (int ch = 'E' - i; ch <= 'E'; ch++) {
				System.out.print((char) ch);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
