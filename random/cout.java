import java.util.*;

public class cout {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		input.close();
		System.out.println(ct(inp));
	}

	static int ct(int s) {
		// int count = 0;
		// while (s > 0) {
		// s = s / 10;
		// count++;
		// }
		// return count;

		return (int) Math.log10(s) + 1; // type cast double to int
	}
}
