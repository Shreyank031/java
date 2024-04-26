import java.util.*;

public class rev1 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		input.close();
		System.out.println(ct(inp));
	}

	static int ct(int s) {
		int reverse = 0;
		while (s > 0) {
			int lastDigit = s % 10;
			s = s / 10;
			reverse = (reverse * 10) + lastDigit;
		}
		return reverse;
	}
}
