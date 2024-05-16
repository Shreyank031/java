import java.util.*;
public class OptTwoSumArr {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 5, 8, 9 };
		int target = 17;
		System.out.println(Sub(arr, target));
	}

	static boolean Sub(int[] arr, int target) {

        Arrays.sort(arr);
        
        int left = arr[0];
        int right = arr[arr.length - 1];

        while (left < right) {
            int sum = left + right;

            if (sum== target) {
                
                    return true;
            }else if (sum == target) {
                right --;
            }else {
                left ++;
            }
        }
        return false;
    }
}