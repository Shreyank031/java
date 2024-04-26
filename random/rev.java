import java.util.*;

public class cout {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		input.close();
		System.out.println(ct(inp));
	}

	static StringBuilder ct(int s) {
		StringBuilder str = new StringBuilder();
		while (s > 0) {
			int lastDigit = s % 10;
			str.append(lastDigit);
			s = s / 10;
		}
		return (StringBuilder) str;
	}
}
