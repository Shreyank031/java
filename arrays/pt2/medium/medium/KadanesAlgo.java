//https://www.youtube.com/watch?v=AHZpyENo7k4&t=460s
import java.util.*;

public class KadanesAlgo {
    public static void main(String args[]) {

        int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int size = array.length;

        System.out.println(max(array, size));
    }

    static int max(int[] arr, int n) {

        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < n; i ++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }
}