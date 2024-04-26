import java.util.*;

public class primeEnhanced {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		input.close();
		printDevisor(inp);
	}

	static void printDevisor(int num) {

		int count = 0;
		// for (int i = 2; i * i <= num; i++) {

		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				count++;
				// count++;
				if (num / i != i) {
					count++;
				}
			}
		}
		// if (count == 0) {
		if (count == 2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
