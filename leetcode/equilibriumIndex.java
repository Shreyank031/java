import java.util.Arrays;

public class equilibriumIndex {
	public static void main(String[] args) {
		int[] array = { -7, 1, 5, 2, -4, 3, 0 };

		System.out.println(equi(array));

	}

	static int equi(int[] arr) {

		int LeftSum, RightSum;
		for (int i = 0; i < arr.length; ++i) {
			LeftSum = 0;
			RightSum = 0;

			for (int j = 0; j < i; j++) {
				LeftSum = LeftSum + arr[j];
			}
			for (int j2 = i + 1; j2 < arr.length; j2++) {
				RightSum = RightSum + arr[j2];
			}
			if (LeftSum == RightSum) {
				return i;
			}
		}
		return -1;
	}
}
