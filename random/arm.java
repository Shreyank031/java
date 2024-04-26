import java.util.*;

public class arm {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		input.close();
		System.out.println(ct(inp));
	}

	static boolean ct(int s) {
		int sum = 0;
		int copy = s;
		while (s > 0) {
			int lastDigit = s % 10;
			int cube = lastDigit * lastDigit * lastDigit;
			s = s / 10;
			sum += cube;
		}
		return copy == sum;
	}
}
