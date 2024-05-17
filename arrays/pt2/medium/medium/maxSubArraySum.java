import java.util.*;

public class maxSubArraySum {
    public static void main(String args[]) {

        int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };

        System.out.println(max(array));
    }

    static int max(int[] arr) {
        int n = arr.length;
        int maxi = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
}
