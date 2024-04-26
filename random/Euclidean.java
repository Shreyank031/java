import java.util.*;

public class Euclidean {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number one: ");
		int inp1 = input.nextInt();

		System.out.print("Enter the number two: ");
		int inp2 = input.nextInt();

		input.close();

		euclid(inp1, inp2);
	}

	static void euclid(int a, int b) {
		while (a > 0 && b > 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a == 0) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
	}
}
