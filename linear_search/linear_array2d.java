import java.util.Arrays;

public class linear_array2d {
	public static void main(String[] args) {

		int[][] array = {
				{ 4, 2, -9 },
				{ 78, 12, 101 },
				{ 3, 1 },
				{ -6, 88, 68 }
		};
		int target = -6;
		System.out.println(Arrays.toString(search(array, target)));

	}

	static int[] search(int[][] arr, int target) {

		for (int row = 0; row < arr.length; row++) { // arr.length gives length of row
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					// return arr[row][col];
					return new int[] { row, col };

				}
			}
		}
		return new int[] { -1, -1 };
	}
}
