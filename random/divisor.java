import java.util.*;

public class divisor {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		input.close();
		ct(inp);
	}

	static void ct(int s) {
		for (int i = 1; i <= s; i++) {
			if (s % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
