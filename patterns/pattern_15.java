import java.util.*;

public class pattern_15 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		input.close();
		pattern(in);
	}

	static void pattern(int in) {
		for (int i = 0; i < in; i++) {
			for (char j = 'A'; j <= 'A' + (in - i - 1); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
