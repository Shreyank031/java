public class evenDigits {
	// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
	public static void main(String[] args) {

		int[] array = { 23, 87, 3432, 1, 872, 986753, 380 };

		int ans = findNumbers(array);
		System.out.println(ans);
	}

	static int findNumbers(int[] arr) {

		int count = 0;
		for (int num : arr) {
			if (even(num)) {
				count++;
			}
		}
		return count;
	}

	// To check whether a number is even or not
	static boolean even(int num) {
		int digits = countDigits(num);
		return digits % 2 == 0;
	}

	// Return the count of the digits
	static int countDigits(int num) {
		int count = 0;
		if (num < 0) {
			num = num * -1;
		}
		if (num == 0) {
			return 1;
		}
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
}
