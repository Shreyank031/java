import java.util.*;

public class pattern_16 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		pattern(in);
	}

	static void pattern(int in) {
		for (int i = 0; i < in; i++) {
			int ch = 'A' + i;
			for (int j = 0; j <= i; j++) {
				System.out.print((char) ch);
			}
			System.out.println();
		}
	}
}
