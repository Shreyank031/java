public class LongestSubArrforK {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 1, 9 };
		int k = 10;
		System.out.println(Sub(arr, k));

	}

	static int Sub(int[] array, int k) {
		int n = array.length;

		int len=0;
		for (int i=0; i<n;i++) {
			int sum = 0;
			
			for (int j=0; j<n; j++) {
				sum += array[j];
				if (k == sum) {
					len = Math.max(len, j+1-i);
						
				}
			}
		}

		return len;
	}
}
