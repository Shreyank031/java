public class richest {
	public static void main(String[] args) {

		int[][] array = {
				{ 1, 2, 3 },
				{ 3, 2, 1 },
				{ 8, 1, 4 }
		};
		System.out.println(maximumWealth(array));
		System.out.println(MaximumWealth(array));
	}

	static int maximumWealth(int[][] accounts) {

		int bigSum = Integer.MIN_VALUE;
		// using regular forloop
		for (int row = 0; row < accounts.length; row++) {// row length
			int sum = 0;
			for (int col = 0; col < accounts[row].length; col++) {
				sum += accounts[row][col];
			}
			if (sum > bigSum) {
				bigSum = sum;
			}
		}

		return bigSum;
	}

	static int MaximumWealth(int[][] accounts) {

		int bigSum = Integer.MIN_VALUE;
		// using enhanced for loop
		for (int[] arr : accounts) {
			int sum = 0;
			for (int ints : arr) {
				sum += ints;
			}
			if (sum > bigSum) {
				bigSum = sum;
			}
		}
		return bigSum;
	}
}
