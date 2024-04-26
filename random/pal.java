import java.util.*;

public class pal {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		input.close();
		System.out.println(ct(inp));
	}

	static boolean ct(int s) {
		int reverse = 0;
		int check = s;
		while (check > 0) {
			int lastDigit = check % 10;
			check = check / 10;
			reverse = (reverse * 10) + lastDigit;
		}
		return s == reverse;
	}
}
