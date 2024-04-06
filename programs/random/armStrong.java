import java.util.*;

public class armStrong {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		// boolean bool = isArm(number);
		// System.out.println(bool);
		// if (bool == true) {
		// System.out.println("The number " + number + " is a Armstrong number!");
		//
		// } else {
		// System.out.println("The number " + number + " is not a Armstrong number!");
		// }

		for (int i = 100; i < number; i++) {
			if (isArm(i)) {
				System.out.println(i);
			}

		}
	}

	static boolean isArm(int num) {

		int temp;
		temp = num;
		int sum = 0;

		while (temp > 0) {

			int rem = temp % 10;
			int cube = rem * rem * rem;
			sum += cube;
			temp = temp / 10;
		}
		return sum == num;
	}
}
